/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author javiv
 */
public class RegistrarYoga {
    public static String registrarParticipantesYoga() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "\n\nYoga\n";
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estilo;
        System.out.println("Ingrese los nombres completos de la persona qur realiza Yoga: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad de la persona que realiza Yoga: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nivel ya sea (principiante, intermedio, avanzado)");
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad de la persona que realiza Yoga: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el estilo de yoga preferido de la persona: ");
        estilo = entrada.nextLine();

        cadena = String.format("%sNombres completos: %s\n"
                + "Edad: %d\n"
                + "Nivel: %s\n"
                + "Ciudad: %s\n"
                + "Estilo de Yoga preferido: %s\n\n",
                cadena,
                nombre,
                edad,
                nivel,
                ciudad,
                estilo);
        return cadena;

    }

}
