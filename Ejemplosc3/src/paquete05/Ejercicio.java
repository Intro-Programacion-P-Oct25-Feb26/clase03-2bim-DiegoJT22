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
        int[] totalPorEstacion = new int[5];
        int mayorProduccion = 0;
        int indiceMayor = 0;

        for (int i = 0; i < estaciones.length; i++) {
            System.out.printf("Ingrese el nombre de la estacion %d \t:",
                    i + 1);
            nombres[i] = entrada.nextLine();

            for (int j = 0; j < estaciones[i].length; j++) {
                System.out.printf("Ingrese el monto de dinero del mes %d de la estacion %d \t:",
                        j + 1, i + 1);
                valorIngresado = entrada.nextInt();
                estaciones[i][j] = valorIngresado;

            }
            entrada.nextLine();

            System.out.println();
        }

        for (int i = 0; i < estaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < estaciones[i].length; j++) {
                suma += estaciones[i][j];
            }
            totalPorEstacion[i] = suma;

            if (suma > mayorProduccion) {
                mayorProduccion = suma;
                indiceMayor = i;
            }
            System.out.println("\nAnálisis de Producción\n");
        }
        for (int i = 0; i < estaciones.length; i++) {
            System.out.printf("Nombre Estación %d - Total Producción: $ %d\n",
                    i + 1, totalPorEstacion[i]);
        }

        System.out.println("\nEstación más productiva: Nombre Estación " + (indiceMayor + 1));
        System.out.println("Encargado de la estación: " + nombres[indiceMayor]);
        System.out.println("Cantidad de la estación más productiva: $ " + mayorProduccion);

    }
}
