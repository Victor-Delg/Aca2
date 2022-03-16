package Colegio;

public class Alumno extends Persona{

    public int AñoEscolar;
    public double ValorPension;

    public Alumno(int ID, String nombreCompleto, int edad, String direccion, int telefono) {
        super(ID, nombreCompleto, edad, direccion, telefono);
    }
}
