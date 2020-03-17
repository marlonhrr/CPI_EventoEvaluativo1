/*
9.      Salida en pantalla de la productoria de n (n ingresado por el usuario).
 */
package ejercicio9;

import javax.swing.JOptionPane;

/**
 * Autores: Santiago Murillo Vergara
 *          Marlon Stiven Herrera Osorio
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        
        //Inicio de variables para calcular memoria después de finalizar programa
        long memoriaLibre = Runtime.getRuntime().freeMemory();
        long memoriaMaxima = Runtime.getRuntime().maxMemory();

        System.out.println("Memoria libre antes de la compilación: " + memoriaLibre + " Bytes");
        
        //Inicio variable para calcular el tiempo de compilación.
        long inicio = System.currentTimeMillis();
        
        //Inicio Ejercicio9
        int acomulador = 1;
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números en los que desea ver la la productoria: "));
        System.out.println("_________________________________________");
        
        if(n <= 1){
            System.out.println("    El resultado de la productoria es: " +acomulador+"."); 
            System.out.println("_________________________________________");
        }
        else {
            for(int i = 1; i <= n; i++) {
            acomulador = acomulador * i;
            }
            System.out.println("    El resultado de la productoria es: " +acomulador+"."); 
            System.out.println("_________________________________________");
        }
        //Fin Ejercicio9
        
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
