/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author javiv
 */
public class RegistrarFutbol {
    public static String registrarParticipantesFutbol() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "\n\nFutbol\n";
        String nombre;
        int edad;
        String posicion;
        String ciudad;
        String equipo;
        System.out.println("Ingrese los nombres completos del futbolista: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del futbolista: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la posicion del futbolista: ");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la ciudad del futbolista: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el equipo favorito del futbolista: ");
        equipo = entrada.nextLine();

        cadena = String.format("%sNombres completos: %s\n"
                + "Edad: %d\n"
                + "Posicion: %s\n"
                + "Ciudad: %s\n"
                + "Equipo Favorito: %s\n\n",
                cadena,
                nombre,
                edad,
                posicion,
                ciudad,
                equipo);
        return cadena;

    }

}
