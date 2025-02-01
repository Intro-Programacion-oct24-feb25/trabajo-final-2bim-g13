/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author javiv
 */
public class RegistrarBasquetball {
public static String registrarParticipantesBasquetball() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "\n\nBasquetball\n";
        String nombre;
        int edad;
        String posicion;
        String ciudad;
        double estatura;
        System.out.println("Ingrese los nombres completos del Basquetbolista: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del Basquetbolista: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la posicion del Basquetbolista: ");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la estatura del Basquetbolista: ");
        estatura = entrada.nextDouble();
        System.out.println("Ingrese la ciudad del Basquetbolista: ");
        ciudad = entrada.nextLine();
        

        cadena = String.format("%sNombres completos: %s\n"
                + "Edad: %d\n"
                + "Posicion: %s\n"
                + "Estatura: %.2fm\n"
                + "Ciudad: %s\n\n",
                cadena,
                nombre,
                edad,
                posicion,
                estatura,
                ciudad);
        return cadena;

    }

}    

