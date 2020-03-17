/*
2.      Declaración de una variable tipo carácter.
 */
package ejercicio2;

/**
 * Autores: Santiago Murillo Vergara
 *          Marlon Stiven Herrera Osorio
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Inicio de variables para calcular memoria después de finalizar programa
        long memoriaLibre = Runtime.getRuntime().freeMemory();
        long memoriaMaxima = Runtime.getRuntime().maxMemory();

        System.out.println("Memoria libre antes de la compilación: " + memoriaLibre + " Bytes");

        //Inicio variable para calcular el tiempo de compilación.
        long inicio = System.currentTimeMillis();
        
        //Inicio Ejercicio2
        char caracter = 'A';
        System.out.println("_________________________________________");
        System.out.println("    La variable tipo caracter ingresada es: " + caracter +"."); 
        System.out.println("_________________________________________");
        //Fin Ejercicio2
        
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