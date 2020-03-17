/*
7.      Declaración de los numerales 1 al 6.
 */
package ejercicio7;

import javax.swing.JOptionPane;

/**
 * Autores: Santiago Murillo Vergara
 *          Marlon Stiven Herrera Osorio
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        
        //Inicio de variables para calcular memoria después de finalizar programa
        long memoriaLibre = Runtime.getRuntime().freeMemory();
        long memoriaMaxima = Runtime.getRuntime().maxMemory();

        System.out.println("Memoria libre antes de la compilación: " + memoriaLibre + " Bytes");
        
        //Inicio variable para calcular el tiempo de compilación.
        long inicio = System.currentTimeMillis();
        
        
    //Inicio Ejercicio7        
        //Inicio Ejercicio1
        int entero = 18;
        System.out.println("_________________________________________");
        System.out.println("    Las variable entera ingresada es: " +entero+"."); 
        System.out.println("_________________________________________");
        //Fin Ejercicio1
        
        //Inicio Ejercicio2
        String caracter = "Compiladores";
        System.out.println("_________________________________________");
        System.out.println("    La variable tipo String ingresada es: " +caracter+"."); 
        System.out.println("_________________________________________");
        //Fin Ejercicio2
        
        //Inicio Ejercicio3
        float flotante = 24.1745f;
        System.out.println("_________________________________________");
        System.out.println("    La variable flotante ingresada es: " +flotante+"."); 
        System.out.println("_________________________________________");
        //Fin Ejercicio3
        
        //Inicio Ejercicio4
        int arregloint[] = new int [3];
        
        for(int i=0; i < arregloint.length; i++){
            arregloint[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor de tipo entero:"));
            System.out.println("Arreglo entero N°"+ i +": " +arregloint[i]);
        }
        
        System.out.println("_________________________________________");
        //Fin Ejercicio4
        
        //Inicio Ejercicio5
        String caracter2 = ".:: ¡Esto es una cadena de caracteres! ::.";
        System.out.println("_________________________________________");
        System.out.println("    La variable tipo cadena de caracteres ingresada es: " +caracter2+"."); 
        System.out.println("_________________________________________");
        //Fin Ejercicio5
        
        //Inicio Ejercicio6
        float arregloflo[] = new float [3];
        
        for(int i=0; i < arregloflo.length; i++){
            arregloflo[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite un valor de tipo flotante:"));
            System.out.println("Arreglo flotante N°"+ i +": " +arregloflo[i]);
        }
        
        System.out.println("_________________________________________");
        //Fin Ejercicio6
        
    //Fin Ejercicio7
        
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