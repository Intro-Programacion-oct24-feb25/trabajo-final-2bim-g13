def registrarParticipantesCiclismo():
    nombre = (input("Ingrese los nombres completos del Ciclista: "))
    edad = (int(input("Ingrese edad del Ciclista: ")))
    especialidad = (input("Ingrese la especialidad ya sea (montaña, ruta, urbano) del Ciclista: "))
    ciudad = (input("Ingrese ciudad del Ciclista: "))
    marca = (input("Ingrese la marca de bicicleta preferida del Ciclista: "))

    reporte = ("\n\nCiclismo\n"
            "Participante: " + nombre
            + "\nEdad: " + str(edad)
            + "\nEspecialidad: " + especialidad
            + "\nCiudad: " + ciudad
            + "\nMarca favorita: " + marca + "\n\n")

    return reporte

