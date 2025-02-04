def registrarParticipantesTenis():
    nombre = (input("Ingrese los nombres completos del Tenista: "))
    edad = (int(input("Ingrese edad del Tenista: ")))
    nivel = (input("Ingrese el nivel ya sea (principiante, intermedio, avanzado) del Tenista: "))
    ciudad = (input("Ingrese ciudad del Tenista: "))
    manoH = (input("Ingrese la mano habil (Derecha/Izquierda) del Tenista: "))

    reporte = ("\n\nTenis\n"
            "Nombres completos: " + nombre
               + "\nEdad: " + str(edad)
               + "\nNivel: " + nivel
               + "\nCiudad: " + ciudad
               + "\nMano Habil: " + manoH + "\n\n")

    return reporte

