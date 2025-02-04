from RegistrarFutbol import registrarParticipantesFutbol
from RegistrarNatacion import registrarParticipantesNatacion
from RegistrarAtletismo import registrarParticipantesAtletismo
from RegistrarBasquetball import registrarParticipantesBasquetball
from RegistrarCiclismo import registrarParticipantesCiclismo
from RegistrarTenis import registrarParticipantesTenis
from RegistrarYoga import registrarParticipantesYoga
from Informacion import obtenerInformacion
from Reporte import obtenerReporte

global reporte
def principal():
    reporte = ""
    sumaA = 0
    bandera = True
    arreglo = [0, 0, 0, 0, 0, 0, 0]
    deportes = ["Futbol", "Natacion", "Atletismo", "Basquetball", "Ciclismo", "Tenis", "Yoga"]
    while(bandera):
        indice = (int(input("Ingrese el deporte, FUTBOL(1), NATACION(2),"
                    + "ATLETISMO(3), BASQUETBALL(4), CICLISMO(5), TENIS(6),"
                    + "YOGA(7)\n")))
        if(indice == 1):
            reporte = "{}{}".format(reporte, registrarParticipantesFutbol())
            arreglo[0] = arreglo[0] + 1
        else:
            if(indice == 2):
                reporte = "{}{}".format(reporte, registrarParticipantesNatacion())
                arreglo[1] = arreglo[1] + 1
            else:
                if(indice == 3):
                    reporte = "{}{}".format(reporte, registrarParticipantesAtletismo())
                    arreglo[2] = arreglo[2] + 1
                else:
                    if(indice == 4):
                        reporte = "{}{}".format(reporte, registrarParticipantesBasquetball())
                        arreglo[3] = arreglo[3] + 1
                    else:
                        if(indice == 5):
                            reporte = "{}{}".format(reporte, registrarParticipantesCiclismo())
                            arreglo[4] = arreglo[4] + 1
                        else:
                            if(indice == 6):
                                reporte = "{}{}".format(reporte, registrarParticipantesTenis())
                                arreglo[5] = arreglo[5] + 1
                            else:
                                if(indice == 7):
                                    reporte = "{}{}".format(reporte, registrarParticipantesYoga())
                                    arreglo[6] = arreglo[6] + 1
                                else:
                                    print("Lo sentimos el club no tiene esa opcion.")
        salida = int(input("Ingrese (0) para salir del programa\n"))
        if(salida == 0):
            bandera = False


    sumaA = sum(arreglo)


    actividades = obtenerInformacion(sumaA)
    reporte2 =  obtenerReporte(deportes, arreglo)
    print (reporte)
    print(actividades)
    print(reporte2)
if __name__ == "__main__":
    principal()

