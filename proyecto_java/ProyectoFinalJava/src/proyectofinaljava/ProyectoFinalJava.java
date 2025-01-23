/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinaljava;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class ProyectoFinalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int indice = 0;
        String salida;
        boolean bandera = true;
        String actividades;
        String cadenaFinal;
        int arreglo [] = new int [6];
        while(bandera){
            System.out.println("Ingrese el deporte, FUTBOL(1), NATACION(2),"
                    + "ATLETISMO(3), BASQUETBALL(4), CICLISMO(5), TENIS(6),"
                    + "YOGA(7)");
            indice = entrada.nextInt();
            if (indice == 1) {
                registrarParticipantesFutbol();
                arreglo[0] = arreglo[0] + 1;
            } else {
                if (indice == 2) {
                    registrarParticipantesNatacion();
                    arreglo[1] = arreglo[1] + 1;
                } else {
                    if (indice == 3) {
                        registrarParticipantesAtletismo();
                        arreglo[2] = arreglo[2] + 1;
                    }else{
                        if(indice == 4){
                            registrarParticipantesBasquetball();
                            arreglo[3] = arreglo[3] + 1;
                        }else{
                            if(indice == 5){
                                registrarParticipantesCiclismo();
                                arreglo[4] = arreglo[4] + 1;
                            }else{
                                if(indice == 6){
                                    registrarParticipantesYoga();
                                    arreglo[5] = arreglo[5] + 1;
                                }
                            }
                        }
                    }
                }
            }
        }

    }
