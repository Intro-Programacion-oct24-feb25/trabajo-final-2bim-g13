/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinaljava;
import java.util.Scanner;
import paquete01.RegistrarFutbol;
import paquete02.RegistrarNatacion;
import paquete03.RegistrarAtletismo;
import paquete04.RegistrarBasquetball;
import paquete05.RegistrarCiclismo;
import paquete06.RegistrarTenis;
import paquete07.RegistrarYoga;
import paquete08.Informacion;
import paquete09.Reporte;
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
        int indice;
        int salida;
        boolean bandera = true;
        String actividades;
        String reporte = "";
        String cadenaFinal = "";
        int arreglo [] = new int [7];
        int sumaA = 0;
        
        String deportes [] = {"Futbol", "Natacion", "Atletismo", "Basquetball", 
                              "Ciclismo", "Tenis", "Yoga"};
        
        while(bandera){
            System.out.println("Ingrese el deporte, FUTBOL(1), NATACION(2),"
                    + "ATLETISMO(3), BASQUETBALL(4), CICLISMO(5), TENIS(6),"
                    + "YOGA(7)");
            indice = entrada.nextInt();
            if (indice == 1) {
                cadenaFinal = String.format("%s%s\n",
                        cadenaFinal, RegistrarFutbol.registrarParticipantesFutbol());
                arreglo[0] = arreglo[0] + 1;
            } else {
                if (indice == 2) {
                    cadenaFinal = String.format("%s%s\n",
                            cadenaFinal, RegistrarNatacion.registrarParticipantesNatacion());
                    arreglo[1] = arreglo[1] + 1;
                } else {
                    if (indice == 3) {
                        cadenaFinal = String.format("%s%s\n",
                                cadenaFinal, RegistrarAtletismo.registrarParticipantesAtletismo());
                        arreglo[2] = arreglo[2] + 1;
                    }else{
                        if(indice == 4){
                            cadenaFinal = String.format("%s%s\n",
                                    cadenaFinal, RegistrarBasquetball.registrarParticipantesBasquetball());
                            arreglo[3] = arreglo[3] + 1;
                        }else{
                            if(indice == 5){
                                cadenaFinal = String.format("%s%s\n",
                                        cadenaFinal, RegistrarCiclismo.registrarParticipantesCiclismo());
                                arreglo[4] = arreglo[4] + 1;
                            }else{
                                if(indice == 6){
                                    cadenaFinal = String.format("%s%s\n",
                                            cadenaFinal, RegistrarTenis.registrarParticipantesTenis());
                                    arreglo[5] = arreglo[5] + 1;
                                }else{
                                    if(indice == 7){
                                        cadenaFinal = String.format("%s%s\n",
                                                cadenaFinal, RegistrarYoga.registrarParticipantesYoga());
                                        arreglo[6] = arreglo[6] + 1;
                                    }else{
                                        System.out.println("Lo sentimos,"
                                            + " el club no tiene esa opción.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Si desea salir del ciclo ingrese (0)");
            salida = entrada.nextInt();
            if(salida == 0){
                bandera = false;
            }
        }
        for(int i = 0; i < arreglo.length; i++){
            sumaA = sumaA + arreglo[i];
        }
        actividades = Informacion.obtenerInformacion(sumaA);
        reporte =  Reporte.obtenerReporte(deportes, arreglo);
        
        
        
        
        
        System.out.printf("%s%s%s", cadenaFinal, actividades, reporte);

    }
}
