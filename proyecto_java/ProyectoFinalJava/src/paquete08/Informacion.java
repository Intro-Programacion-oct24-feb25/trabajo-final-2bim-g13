/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete08;

/**
 *
 * @author javiv
 */
public class Informacion {
    public static String obtenerInformacion(int a){
        String mensaje;
        if(a >= 1 && a <= 5){
            mensaje = "Poca particion en el club hay que mejorar.\n\n";
        }else{
            if(a >= 6 && a <= 15){
                mensaje = "Buena participación, sigan así.\n\n";
            }else{
                if(a >= 16){
                    mensaje = "Excelente campaña del club.\n\n";
                }else{
                    mensaje = "Mala campaña, debemos mejorar.\n\n";
                }
            }
        }
       
        return mensaje;
    }
}
