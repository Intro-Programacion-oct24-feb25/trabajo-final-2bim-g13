/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete09;

/**
 *
 * @author javiv
 */
public class Reporte {
    public static String obtenerReporte(String [] a, int [] b){
        String mensaje = "";
        int contador = 0;
        mensaje = String.format("%sLas actividades ingresadas son:\n", mensaje);
        for(int i = 0; i < a.length; i++){
            contador = contador + 1;
            mensaje = String.format("%s%d. Numero de participantes de %s: %d\n", 
                    mensaje, 
                    contador, 
                    a[i], 
                    b[i]);
            
        }
        
        return mensaje;
    }
}
