def registrarParticipantesAtletismo():
    nombre = (input("Ingrese nombre del Atleta: "))
    edad = (int(input("Ingrese edad del Atleta: ")))
    especialidad = (input("Ingrese la especialidad ya sea (carreras, salto, lanzamiento) del Atleta: "))
    ciudad = (input("Ingrese ciudad del Atleta: "))
    record = (input("Ingrese el record personal del Atleta: "))

    reporte = ("\n\nAtletismo\n"
            "Nombres Completos: " + nombre
            + "\nEdad: " + str(edad)
            + "\nEspecialidad: " + especialidad
            + "\nCiudad: " + ciudad
            + "\nRecord: " + record + "\n\n")

    return reporte

