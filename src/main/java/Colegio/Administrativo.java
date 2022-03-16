package Colegio;

public class Administrativo extends Persona{

    public String AreaTrabajo;
    public String TipoContrato;

    public Administrativo(int ID, String nombreCompleto, int edad, String direccion, int telefono) {
        super(ID, nombreCompleto, edad, direccion, telefono);
    }
}
