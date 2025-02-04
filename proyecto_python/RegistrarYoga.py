def registrarParticipantesYoga():
    nombre = (input("Ingrese los nombres completos de la persona que realiza Yoga: "))
    edad = (int(input("Ingrese la edad de la persona que realiza Yoga: ")))
    nivel = (input("Ingrese el nivel ya sea (principiante, intermedio, avanzado) de la persona que realiza Yoga : "))
    ciudad = (input("Ingrese la ciudad de la persona que realiza Yoga: "))
    estilo = (input("Ingrese el estilo de yoga preferido de la persona: "))

    reporte = ("\n\nYoga\n"
            "Nombres completos: " + nombre
            + "\nEdad: " + str(edad)
            + "\nNivel: " + nivel
            + "\nCiudad: " + ciudad
            + "\nEstilo: " + estilo + "\n\n")

    return reporte

