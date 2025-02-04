def obtenerInformacion(a):

    if(a >= 1 and a <= 5):
        mensaje = "Poca particion en el club hay que mejorar.\n\n"
    else:
        if(a >= 6 and a <= 15):
            mensaje = "Buena participación, sigan así.\n\n"
        else:
            if(a >= 16):
                mensaje = "Excelente campaña del club.\n\n"
            else:
                mensaje = "Mala campaña, debemos mejorar.\n\n"

    return mensaje










