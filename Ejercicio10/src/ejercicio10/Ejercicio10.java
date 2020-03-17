/*
10.  Salida en archivo del programa Hola, Mundo.
 */
package ejercicio10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Autores: Santiago Murillo Vergara
 *          Marlon Stiven Herrera Osorio
 */
public class Ejercicio10 {

    public static void main(String args[]) {
        
        //Inicio de variables para calcular memoria después de finalizar programa
        long memoriaLibre = Runtime.getRuntime().freeMemory();
        long memoriaMaxima = Runtime.getRuntime().maxMemory();

        System.out.println("Memoria libre antes de la compilación: " + memoriaLibre + " Bytes");
        
        //Inicio variable para calcular el tiempo de compilación.
        long inicio = System.currentTimeMillis();
        
        //Inicio Ejercicio10
        try {
            String ruta = "D:/HolaMundo.txt";
            String contenido = "Este archivo muestra el Hola Mundo del ejercicio 10...";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("_________________________________________");
                System.out.println("Se ha creado el archivo de manera exitosa en la siguiente ruta: "+ruta);
                System.out.println("_________________________________________");
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //Fin Ejercicio10
        
        //Finalizó el calculo de tiempo de compilación.
        long fin = System.currentTimeMillis();
        
        //Se realiza calculo con variables inicio y fin para dar el tiempo en segundos.
        double tiempo = ((fin - inicio)/1000);
        
        //Muestro el tiempo de ejecución.
        System.out.println("    El tiempo de compilación del programa es de: "+ tiempo +" segundos.");
        System.out.println("_________________________________________");
        
        //Muestro la memoria usada calculando memoriaMaxima - memoriaLibre
        memoriaLibre = Runtime.getRuntime().freeMemory();

        System.out.println("Memoria libre despues de la compilación: " + memoriaLibre + " Bytes");
        System.out.println("Memoria usada despues de la compilación: " + (memoriaMaxima - memoriaLibre) + " Bytes");
    }
}