/*
8.      Salida en pantalla de los n primeros números de la serie Fibonacci (n ingresado por el usuario).
 */
package ejercicio8;

import javax.swing.JOptionPane;

/**
 * Autores: Santiago Murillo Vergara
 *          Marlon Stiven Herrera Osorio
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        
        //Inicio de variables para calcular memoria después de finalizar programa
        long memoriaLibre = Runtime.getRuntime().freeMemory();
        long memoriaMaxima = Runtime.getRuntime().maxMemory();

        System.out.println("Memoria libre antes de la compilación: " + memoriaLibre + " Bytes");
        
        //Inicio variable para calcular el tiempo de compilación.
        long inicio = System.currentTimeMillis();
        
        //Inicio Ejercicio8        
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("  Ingrese la cantidad de números en los que desea ver la serie de Fibonacci:"));
        System.out.println("_________________________________________");
        
        if(n == 0){
            System.out.println("    No se puede mostrar datos con valor inicial en cero.");
        }
        else if(n == 1){
            int arregloinicial[] = new int [n];
            arregloinicial[0]= 0;
            
            System.out.println("    Resultado Serie de Fibonacci:");
            System.out.println("                                 "+arregloinicial[0]);
        }
        else {
            int arregloinicial[] = new int [n];
            arregloinicial[0]= 0;
            arregloinicial[1]= 1;

            for(int i = 2; i < n; i++){
                arregloinicial[i]= arregloinicial[i - 2] + arregloinicial[i -1];
            }

            System.out.println("    Resultado Serie de Fibonacci:");

            for(int j = 0; j < arregloinicial.length; j++){
                System.out.println("                             "+arregloinicial[j]);
            }
        }
        System.out.println("_________________________________________");
        //Fin Ejercicio8
        
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