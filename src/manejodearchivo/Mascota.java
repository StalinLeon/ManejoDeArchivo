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
    private String CodigoMascota;
    private String Nombre;
    private String Raza;
    private String FechaNacimiento;
    private String Color;
    private String Cedula;
    private String Duenio;

    public Mascota() {
    }

    public Mascota(String CodigoMascota, String Nombre, String Raza, String FechaNacimiento, String Color, String Cedula, String Duenio) {
        this.CodigoMascota = CodigoMascota;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.FechaNacimiento = FechaNacimiento;
        this.Color = Color;
        this.Cedula = Cedula;
        this.Duenio = Duenio;
    }

    public String getCodigo() {
        return CodigoMascota;
    }

    public void setCodigo(String Codigo) {
        this.CodigoMascota = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getDuenio() {
        return Duenio;
    }

    public void setDuenio(String Duenio) {
        this.Duenio = Duenio;
    }
   
    
    
}
