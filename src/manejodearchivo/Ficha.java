/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivo;

/**
 *
 * @author USUARIO
 */
public class Ficha {
    private String fechaFicha; 
    private String sintoma;
    private String dianostico;
    private String tratamiento;

    public Ficha() {
    }

    public Ficha(String fechaFicha, String sintoma, String dianostico, String tratamiento) {
        this.fechaFicha = fechaFicha;
        this.sintoma = sintoma;
        this.dianostico = dianostico;
        this.tratamiento = tratamiento;
    }

    public String getFechaFicha() {
        return fechaFicha;
    }

    public void setFechaFicha(String fechaFicha) {
        this.fechaFicha = fechaFicha;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getDianostico() {
        return dianostico;
    }

    public void setDianostico(String dianostico) {
        this.dianostico = dianostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
}
