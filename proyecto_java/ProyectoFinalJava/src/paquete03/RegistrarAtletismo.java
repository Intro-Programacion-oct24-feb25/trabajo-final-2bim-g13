/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;
import java.util.Scanner;
/**
 *
 * @author javiv
 */
public class RegistrarAtletismo {
    public static String registrarParticipantesAtletismo() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "\n\nAtletismo\n";
        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        String record;
        System.out.println("Ingrese los nombres completos del Atleta: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del Atleta: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la especialidad ya sea (carreras, salto, lanzamiento)"
                + " del Atleta: ");
        especialidad = entrada.nextLine();
        System.out.println("Ingrese la ciudad del Atleta: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el record personal del Atleta: ");
        record = entrada.nextLine();

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
                record);
        return cadena;

    }

}
