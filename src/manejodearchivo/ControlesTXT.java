/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author USUARIO
 */
public class ControlesTXT {

    String rutaArchivo1 = ("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\ManejoDeArchivo\\espedientes\\archivo1.txt");
    String rutaArchivo2 = ("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\ManejoDeArchivo\\espedientes\\archivo2.txt");
    String rutaArchivo3 = ("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\ManejoDeArchivo\\espedientes\\archivo3.txt");
    String rutaArchivo4 = ("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\ManejoDeArchivo\\espedientes\\archivo4.txt");
    String contenido1 = "Contenido de ejemplo1";
    String contenido2 = "Contenido de ejemplo2";
    String rutaCorta = "archivo.txt";

    public ControlesTXT() {
    }

    public void CrearArchivoConFileWriteAndBuffereWrite() {
        try {
            File file = new File(rutaArchivo1);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido1);
            bw.write("     " + contenido2);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CrearArchivoConPrintWriter() {
        try {
            PrintWriter writer = new PrintWriter(rutaArchivo2, "UTF-8");
            writer.println("Primera línea");
            writer.println("Segunda línea");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CrearArchivoConPrintWriterPrint() {
        try {
            PrintWriter printWriter = new PrintWriter(rutaArchivo3);
            printWriter.print("Test PrintWriter Line 1 ");
            printWriter.print("Test PrintWriter Line 2 ");
            printWriter.print("Test PrintWriter Line 3");
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void CrearArchivoConPrintWriterPrintln() {
        try {
            PrintWriter printWriter = new PrintWriter(rutaArchivo4);

            for (int i = 1; i < 4; i++) {
                printWriter.println("This is Line no. " + i);
            }

            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void AgregarMascota(String cedula, String nombre) {
        try {
            File file = new File(rutaCorta);
            if(file.exists()==false){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(cedula + "    "+nombre); 
            bw.write("\n");
            bw.close();
            System.out.println("El prosucto ha sido insertado en la base de dato");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
