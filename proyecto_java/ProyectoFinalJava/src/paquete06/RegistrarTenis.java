/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import java.util.Scanner;

/**
 *
 * @author javiv
 */
public class RegistrarTenis {
    public static String registrarParticipantesTenis() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "\n\nTenis\n";
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String manoHabil;
        System.out.println("Ingrese los nombres completos del Tenista: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del Tenista: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nivel ya sea (principiante, intermedio, avanzado)"
                + " del Tenista: ");
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad del Tenista: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la mano habil (Derecha/Izquierda) del Tenista: ");
        manoHabil = entrada.nextLine();

        cadena = String.format("%sNombres completos: %s\n"
                + "Edad: %d\n"
                + "Nivel: %s\n"
                + "Ciudad: %s\n"
                + "Mano Habil: %s\n\n",
                cadena,
                nombre,
                edad,
                nivel,
                ciudad,
                manoHabil);
        return cadena;

    }

}
