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
// esta es una prueba para git
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota m1 = new Mascota("1234567892", "Stalin");
        Mascota m2 = new Mascota("8545622542", "Maria");
        Mascota m3 = new Mascota("0125125582", "Carlo");

        ControlesTXT tXT = new ControlesTXT();
        tXT.AgregarMascota(m1.getCedula(), m1.getNombre());
        tXT.AgregarMascota(m2.getCedula(), m2.getNombre());
        tXT.AgregarMascota(m3.getCedula(), m3.getNombre());
  
    }
    
    
    
}
