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
public class DuenioMascota {
     private String nombre;
    private String numCedula;
    private String numTelfono;
    private String direccion;

    public DuenioMascota() {
    }

    public DuenioMascota(String nombre, String numCedula, String numTelfono, String direccion) {
        this.nombre = nombre;
        this.numCedula = numCedula;
        this.numTelfono = numTelfono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public String getNumTelfono() {
        return numTelfono;
    }

    public void setNumTelfono(String numTelfono) {
        this.numTelfono = numTelfono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
