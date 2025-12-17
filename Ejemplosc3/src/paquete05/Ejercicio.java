/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author daigo
 */
public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[][] estaciones = new int[5][12];
        String[] nombres = new String[5];
        double sumaIngresos;
        sumaIngresos = 0;
        int valorIngresado;

        
         for (int i = 0; i < estaciones.length; i++) {
             
            for (int j = 0; j < estaciones[i].length; j++) {
                System.out.printf("Ingrese %d \t:",
                        j+1);
                valorIngresado = entrada.nextInt();
                estaciones[i][j] = valorIngresado;

            }
            
            System.out.println();
        }

        for (int fila = 0; fila < estaciones.length; fila++) {
            
            for (int col = 0; col < estaciones[fila].length; col++) { 
                
                sumaIngresos = sumaIngresos + estaciones[fila][col];

            }
            System.out.printf("Suma: %s", sumaIngresos);
        }
    }
}
