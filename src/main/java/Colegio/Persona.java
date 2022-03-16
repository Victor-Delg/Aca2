package Colegio;

public class Persona {

    public int ID;
    public String NombreCompleto;
    public int Edad;
    public String Direccion;
    public int Telefono;


    public Persona(int ID, String nombreCompleto, int edad, String direccion, int telefono) {
        this.ID = ID;
        NombreCompleto = nombreCompleto;
        Edad = edad;
        Direccion = direccion;
        Telefono = telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }
}
