package proyectopass;

import java.sql.*;
import javax.swing.JOptionPane;

public class Usuraio 
{
    private String user;
    private String password;
    
    public Usuraio()
    {}
    
    
    public Usuraio(String vUser, String vPassword)
    {
        user = vUser;
        password = vPassword;
    }
    
    public void insert() throws SQLException
    {
    // the mysql insert statement
        Connection conexion= Conexion1.GetConnection();
        Statement comando=conexion.createStatement();
        String query = " insert into usuario (user, password)"+ " values (?, ?)";
        PreparedStatement preparedStmt = conexion.prepareStatement(query);
        preparedStmt.setString (1, "Barney");
        preparedStmt.setString (2, "12345678*");
        preparedStmt.execute();
    }
    
    public Boolean loggin() throws SQLException
    {
        Boolean resp = false;
        Connection conexion= Conexion1.GetConnection();
        String contrasenia;
        Statement comando=conexion.createStatement();
        ResultSet registro = comando.executeQuery("select * from usuario "+ "where user = " + "'" +user+"'");

        if (registro.next()) 
        {
            contrasenia = registro.getString("password");
            
            if (contrasenia.equals(password)) 
            {
                JOptionPane.showMessageDialog(null, "el loggin es correcto");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "el loggin no correcto");
            }
        }

        conexion.close();
        return resp;
    }
}