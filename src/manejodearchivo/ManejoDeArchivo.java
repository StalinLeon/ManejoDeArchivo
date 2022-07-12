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
        // TODO code application logic here
//        File archivo = new File("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\ManejoDeArchivo\\espedientes\\archivo.txt");
//        System.out.println("Existe: " + archivo.exists());
//        System.out.println("¿Se puede leer?: " + archivo.canRead());
//        System.out.println("Se puede escribir?: " + archivo.canWrite());
        ControlesTXT tXT = new ControlesTXT();
        tXT.CrearArchivoConFileWriteAndBuffereWrite();
        tXT.CrearArchivoConPrintWriter();
        tXT.CrearArchivoConPrintWriterPrint();
        tXT.CrearArchivoConPrintWriterPrintln();
        
    }
    
    
    
}
