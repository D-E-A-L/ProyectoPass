/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopass;

/**
 *
 * @author Demon
 */
public class TerceraEdad extends Cliente
{
    private String fechaNacimiento;
    
    @Override
    public void registrarAM(String am) {
        super.registrarAM(am);
    }

    @Override
    public void registrarAP(String ap) {
        super.registrarAP(ap);
    }

    @Override
    public void registrarN(String n) {
        super.registrarN(n);
    }
    
    public TerceraEdad()
    {
    }
   
    public void setFN(String nf)
    {
        this.fechaNacimiento=nf;
    }
    
    public String getFN()
    {
        return fechaNacimiento;
    }
}
