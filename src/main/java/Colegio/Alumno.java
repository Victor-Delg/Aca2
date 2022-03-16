package Colegio;

public class Alumno {
    public Alumno(int ID, String nombreCompleto, int edad, String direccion, int telefono, int añoEscolar, double valorPension) {
        this.ID = ID;
        NombreCompleto = nombreCompleto;
        Edad = edad;
        Direccion = direccion;
        Telefono = telefono;
        AñoEscolar = añoEscolar;
        ValorPension = valorPension;
    }

    public int ID;
    public String NombreCompleto;
    public int Edad;
    public String Direccion;
    public int Telefono;
    public int AñoEscolar;
    public double ValorPension;
}

