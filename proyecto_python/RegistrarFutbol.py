def registrarParticipantesFutbol():
    nombre = (input("Ingrese nombre del Futbolista: "))
    edad = (int(input("Ingrese edad del Futbolista: ")))
    posicion = (input("Ingrese posicion preferida del Futbolista: "))
    ciudad = (input("Ingrese ciudad del Futbolista: "))
    equipo = (input("Ingrese equipo favorito del Futbolista: "))

    reporte = ("\n\nFutbol\n"
            "Nombres Completos: " + nombre
            + "\nEdad: " + str(edad)
            + "\nPosición preferida: " + posicion
            + "\nCiudad: " + ciudad
            + "\nEquipo favorito: " + equipo + "\n\n")

    return reporte

