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
public class Historial {
    private String Codigo;  
    private String Placa;
    private String Fecha;
    private String Sintomas;
    private String Tratamiento;
    private String Receta;
    private String Peso;  

    public Historial() {
    }

    public Historial(String Codigo, String Placa, String Fecha, String Sintomas, String Tratamiento, String Receta, String Peso) {
        this.Codigo = Codigo;
        this.Placa = Placa;
        this.Fecha = Fecha;
        this.Sintomas = Sintomas;
        this.Tratamiento = Tratamiento;
        this.Receta = Receta;
        this.Peso = Peso;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getSintomas() {
        return Sintomas;
    }

    public void setSintomas(String Sintomas) {
        this.Sintomas = Sintomas;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }

    public String getReceta() {
        return Receta;
    }

    public void setReceta(String Receta) {
        this.Receta = Receta;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }
            
}
