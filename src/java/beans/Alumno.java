/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Privado
 */
public class Alumno 
{
    private String matricula,nombre,apellidoP,apellidoM;
    private int ddi,dwi,ecbd;
    private int prom;

    public Alumno ()
    {
     matricula=apellidoP=apellidoM=nombre="";
     ddi=dwi=ecbd=0;
     prom=0;
        
    }
            
    public Alumno(String matricula, String nombre, String apellidoP, String apellidoM, int ddi, int dwi, int ecbd, int prom) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.ddi = ddi;
        this.dwi = dwi;
        this.ecbd = ecbd;
        this.prom = prom;
    }
   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public int getDwi() {
        return dwi;
    }

    public void setDwi(int dwi) {
        this.dwi = dwi;
    }

    public int getEcbd() {
        return ecbd;
    }

    public void setEcbd(int ecbd) {
        this.ecbd = ecbd;
    }

    public int getProm() {
        return prom=(ddi+dwi+ecbd)/3;
    }
   

    public void add(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
