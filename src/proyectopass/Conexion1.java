package proyectopass;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion1 
{
    public static Connection GetConnection()
    {
        Connection conexion=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/usertest";
            String usuarioDB="root";
            String passwordDB="";
            conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
            System.out.println("conexion establecida");
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        conexion=null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        conexion=null;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        conexion=null;
        }
    finally
    {
        return conexion;
    }
  }
}