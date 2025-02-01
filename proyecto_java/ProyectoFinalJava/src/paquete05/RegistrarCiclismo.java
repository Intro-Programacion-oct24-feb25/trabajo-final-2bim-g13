/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author javiv
 */
public class RegistrarCiclismo {
    public static String registrarParticipantesCiclismo() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "\n\nCiclismo\n";
        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        String marca;
        System.out.println("Ingrese los nombres completos del Ciclista: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del Ciclista : ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la especialidad ya sea (montaña, ruta, urbano))"
                + " del Ciclista: ");
        especialidad = entrada.nextLine();
        System.out.println("Ingrese la ciudad del Ciclista: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la marca de bicicleta preferida del Ciclista: ");
        marca = entrada.nextLine();

        cadena = String.format("%sNombres completos: %s\n"
                + "Edad: %d\n"
                + "Especialidad: %s\n"
                + "Ciudad: %s\n"
                + "Record personal: %s\n\n",
                cadena,
                nombre,
                edad,
                especialidad,
                ciudad,
                marca);
        return cadena;

    }

}

