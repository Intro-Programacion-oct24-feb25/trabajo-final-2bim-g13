def registrarParticipantesBasquetball():
    nombre = (input("Ingrese los nombres completos del Basquetbolista: "))
    edad = (int(input("Ingrese la edad del Basquetbolista: ")))
    posicion = (input("Ingrese la posicion del Basquetbolista: "))
    estatura = (input("Ingrese la estatura del Basquetbolista: "))
    ciudad = (input("Ingrese la ciudad del Basquetbolista: "))

    reporte = ("\n\nBasquetball\n"
            "Nombres completos: " + nombre
            + "\nEdad: " + str(edad)
            + "\nPosición preferida: " + posicion
            + "\nEstatura: " + estatura
            + "\nCiudad: " + ciudad + "\n\n")

    return reporte

