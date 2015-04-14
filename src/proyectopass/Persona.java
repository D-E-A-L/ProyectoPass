package proyectopass;

import java.sql.*;
import javax.swing.JOptionPane;

public class Persona 
{
    String nombre, contrasenia;
    
    public String getContrasenia()
    {
        return contrasenia;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setContrasenia(String contrasenia1)
    {
        this.contrasenia = contrasenia1;
    }
    
    public void setNombre (String nombre)
    {
        this.nombre=nombre;
    }
}
