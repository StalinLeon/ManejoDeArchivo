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
public class Mascota {
    private String codigoMascota;
    private String nombre;
    private String raza;
    private String fechaNacimiento;
    private String fechaExaminacion;
    private String color;

    public Mascota() {
    }

    public Mascota(String codigoMascota, String nombre, String raza, String fechaNacimiento, String fechaExaminacion, String color) {
        this.codigoMascota = codigoMascota;
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaExaminacion = fechaExaminacion;
        this.color = color;
    }

    public String getCodigoMascota() {
        return codigoMascota;
    }

    public void setCodigoMascota(String codigoMascota) {
        this.codigoMascota = codigoMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaExaminacion() {
        return fechaExaminacion;
    }

    public void setFechaExaminacion(String fechaExaminacion) {
        this.fechaExaminacion = fechaExaminacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    

    
   
    
    
}
