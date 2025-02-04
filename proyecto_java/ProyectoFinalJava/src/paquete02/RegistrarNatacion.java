/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import java.util.Scanner;
/**
 *
 * @author javiv
 */
public class RegistrarNatacion {
   public static String registrarParticipantesNatacion() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "\n\nNatacion\n";
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estilo;
        System.out.println("Ingrese los nombres completos del Nadador: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del Nadador: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nivel ya sea (principiante, intermedio, avanzado)"
                + " del Nadador: ");
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad del Nadador: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el estilo favorito del Nadador: ");
        estilo = entrada.nextLine();

        cadena = String.format("%sNombres completos: %s\n"
                + "Edad: %d\n"
                + "Nivel: %s\n"
                + "Ciudad: %s\n"
                + "Estilo Favorito: %s\n\n",
                cadena,
                nombre,
                edad,
                nivel,
                ciudad,
                estilo);
        return cadena;

    }

}
 

