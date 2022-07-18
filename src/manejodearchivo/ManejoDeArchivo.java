/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivo;

import java.io.File;

/**
 *
 * @author USUARIO
 */
public class ManejoDeArchivo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DatosRimpe dr = new DatosRimpe();

        ControlesTXT tXT = new ControlesTXT();

        String datoBuscar = "0101050649001";
        String cadena;
        cadena = tXT.Buscar(datoBuscar, "rimpe.txt");
        if(cadena == ""){
            System.out.println("El RUC NO FUE ENCONTRADO");
        }
        dr = tXT.instanciarDatosRimpe(cadena, dr);
        System.out.println(dr.getRuc());
        System.out.println(dr.getNombreContribuyente());
        System.out.println(dr.getZonal());
        System.out.println(dr.getRegimen());
        System.out.println(dr.getNegocioPopular());
    }
}
