def obtenerReporte(a, b):
    mensaje = ""
    contador = 0
    mensaje = mensaje + "Las actividades ingresadas son: \n"
    while(contador < len(a)):
        mensaje = mensaje + str(contador) + ".Numero de Participantes de "+ a[contador] + ": " + str(b[contador]) + "\n"
        contador = contador + 1


    return mensaje





