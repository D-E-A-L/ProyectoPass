package proyectopass;

import java.sql.*;
import javax.swing.*;

public class Conexion 
{
    public String bd="usuarios";
    public String login="root";
    public String password="";
    public String url="jdbc:mysql://localhost/"+bd;
    private Persona pers=new Persona();
    
    Connection conn=null; 
  
    public Conexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            if(conn!=null)
            {
                JOptionPane.showMessageDialog(null,"Conexion de base de datos"+bd+". listo");                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }
    
    public Connection getConnection()
    {
        return conn;
    }
    
    public void desconectar()
    {
        conn = null;
    }
    
public Object[][] select (String table, String fields, String where)
{
    int registros = 0 ;
    String colname[] = fields.split(",");

    String q1 = "SELECT" + fields + "FROM" + table;
    String q2 = "SELECT count (*) as total FROM" + table;

    if(where!=null)
    {
        q1+= "WHERE" + where;
        q2+= "WHERE" + where;
    }
    try
    {
        PreparedStatement pstm = conn.prepareStatement(q2);
        ResultSet res = pstm.executeQuery();
        res.next();
        registros = res.getInt("total");
        res.close();
    }catch(SQLException e)
    {
        System.out.println(e);
    }
    
    Object[][] data = new String [registros][fields.split(",").length];
    try
    {
        PreparedStatement pstm = conn.prepareStatement(q1);
        ResultSet res = pstm.executeQuery();
        int i = 0;
        while (res.next())
        {
            for(int j=0;j<=fields.split(",").length-1;j++)
            {
                data[i][j] = res.getString(colname[j].trim());
            }i++;
            res.close();
        }
     }
    catch(SQLException e)
    {
        System.out.println(e);
    }return data;
}

    public boolean ingresar (String user, String contra)
    {
        Object[][] = res this.select("tablausers","usuario,contrasenia","usuario='"+user+"' AND contrasenia='"+contra+"' ");
        if ( res.length > 0)
        {
            pers.setNombre(res[0][0].toString());
            pers.setContrasenia(res[0][1].toString());
            
            return true;
        }else
        {
            return false;
        }
    }
    
    public void NuevaPersona (String name, String contra)
    {
        try
        {
            PreparedStatement pstm = this.getConnection().prepareStatement("insert into "+"tablausers(USUARIO,CONTRASÑA) "+ "values (?,?)");
            pstm.setString(1, name);
            pstm.setString(2, contra);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "usuario"+" "+name+" "+"creado correctamente");
        }catch(SQLException e)
         {
             System.out.println(e);
         }
    }
}