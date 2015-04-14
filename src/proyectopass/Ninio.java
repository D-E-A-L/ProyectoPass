/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopass;

/**
 *
 * @author Demon
 */
public class Ninio extends Cliente
{
    private String nombreApoderado;
    private String apellidoPA;
    private String apellidoMA;
    private String fechaNacimiento;
    
    public Ninio(){}

    @Override
    public void registrarAP(String ap) {
        super.registrarAP(ap);
    }

    @Override
    public void registrarAM(String am) {
        super.registrarAM(am);
    }

    @Override
    public void registrarN(String n) {
        super.registrarN(n);
    }
    

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public String getAM() {
        return super.getAM();
    }
    
    @Override
    public String getAP() {
        return super.getAP();
    }
    
    public void setNA(String na)
    {
        this.nombreApoderado=na;
    }
    
    public void setPA(String pa)
    {
        this.apellidoPA=pa;
    }
    
    public void setMA(String ma)
    {
        this.apellidoMA=ma;
    }
    
    public String getNA()
    {
        return nombreApoderado;
    }
    
    public String getPA()
    {
        return apellidoPA;
    }
    
    public String getMA()
    {
        return apellidoMA;
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
