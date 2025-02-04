def registrarParticipantesNatacion():
    nombre = (input("Ingrese los nombres completos del Nadador: "))
    edad = (int(input("Ingrese la edad del Nadador: ")))
    nivel = (input("Ingrese el nivel ya sea (principiante, intermedio, avanzado) del Nadador: "))
    ciudad = (input("Ingrese la ciudad del Nadador: "))
    estilo = (input("Ingrese el estilo favorito del Nadador: "))

    reporte = ("\n\nNatacion\n"
            "Nombres Completos: " + nombre
            + "\nEdad: " + str(edad)
            + "\nNivel: " + nivel
            + "\nCiudad: " + ciudad
            + "\nEstilo favorito: " + estilo + "\n\n")

    return reporte

