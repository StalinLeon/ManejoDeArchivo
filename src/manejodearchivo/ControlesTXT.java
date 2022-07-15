/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class ControlesTXT {

    String contenido1 = "Contenido de ejemplo1";
    String contenido2 = "Contenido de ejemplo2";
    String rutaCorta = "archivo.txt";

    public ControlesTXT() {
    }

    public void CrearArchivoRutaCorta() {
        try {
            File file = new File(rutaCorta);
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

    public void CrearArchivoConFileWriteAndBuffereWrite() {
        try {
            File file = new File(rutaCorta);
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
            PrintWriter writer = new PrintWriter(rutaCorta, "UTF-8");
            writer.println("Primera línea");
            writer.println("Segunda línea");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CrearArchivoConPrintWriterPrint() {
        try {
            PrintWriter printWriter = new PrintWriter(rutaCorta);
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
            PrintWriter printWriter = new PrintWriter(rutaCorta);

            for (int i = 1; i < 4; i++) {
                printWriter.println("This is Line no. " + i);
            }

            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    La clase Scanner puede leer archivos en Java
//    . Primero , se crea un objeto Archivo que representa la ruta de su archivo requerido
//    . El objeto de la clase Scanner se crea pasando el objeto File anterior.La función
//    hasNext() comprueba si existe otra línea en un archivo y la función nextLine() lee la línea dada.
    public void LeerArchivoConScaner(String archivo) {
        try {
            File doc = new File(archivo);
            Scanner obj = new Scanner(doc);

            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControlesTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void LeerArchivoConInputStream(String archivo) {
        try {
            InputStream ins = new FileInputStream(archivo);
            Scanner obj = new Scanner(ins);
            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());
            }
        } catch (Exception e) {
        }
    }

    public void LeerArchivoConReader(String archivo) {
        try {
            File doc = new File(archivo);
            FileReader reader = new FileReader(doc);
            BufferedReader obj = new BufferedReader(reader);
            String strng;
            while ((strng = obj.readLine()) != null) {
                System.out.println(strng);
            }
        } catch (Exception e) {
        }
    }

    void ResitrarMascota(String cedula, String nombre) {
        try {
            File file = new File(rutaCorta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                System.out.println("El archivo ya existe");;
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(cedula + "     " + nombre);
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

    void AgregarMascota(String cedula, String nombre) {
        try {
            File file = new File(rutaCorta);
            if (file.exists() == false) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(cedula + "    " + nombre);
            bw.write("\n");
            bw.close();
            System.out.println("El prosucto ha sido insertado en la base de dato");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public DatosRimpe instanciarDatosRimpe(String cadena, DatosRimpe dr) {
        String[] split = cadena.split(";", -1);
        for (int i=0; i<split.length; i++){
            if(i==0) dr.setRuc(split[i]);
            if(i==1) dr.setNombreContribuyente(split[i]);
            if(i==2) dr.setZonal(split[i]);
            if(i==3) dr.setRegimen(split[i]);
            if(i==4) dr.setNegocioPopular(split[i]);
        }        
        return dr;
    }

    public String Buscar(String datoBuscar, String archivo) {
        String cadena="";
        String lineaCadena;
        try {
            InputStream ins = new FileInputStream(archivo);
            Scanner obj = new Scanner(ins);

            while (obj.hasNextLine()) {
                lineaCadena = obj.nextLine();
                String[] split = lineaCadena.split(";", -1);
             
                if(split[0].equals(datoBuscar)){
                cadena = lineaCadena;
                System.out.println(cadena);
                return cadena;
                }
            }     
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

}
