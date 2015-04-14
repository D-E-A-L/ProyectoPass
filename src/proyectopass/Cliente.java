/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopass;

/**
 *
 * @author Demon
 */
public class Cliente 
{
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    
    public Cliente(){}
    
    public void registrarN(String n)
    {
        this.nombre=n;
    }
    
    public void registrarAP(String ap)
    {
        this.apellidoPaterno=ap;
    }
    
    public void registrarAM(String am)
    {
        this.apellidoMaterno=am;
    }
    
    public String getNom()
    {
        return nombre;
    }
    
    public String getAP()
    {
        return apellidoPaterno;
    }
     public String getAM()
     {
         return apellidoMaterno;
     }
}
