package Colegio;

public class Administrativo{
        public Administrativo(int ID, String nombreCompleto, int edad, String direccion, int telefono, String areaTrabajo, String tipoContrato) {
                this.ID = ID;
                NombreCompleto = nombreCompleto;
                Edad = edad;
                Direccion = direccion;
                Telefono = telefono;
                AreaTrabajo = areaTrabajo;
                TipoContrato = tipoContrato;
        }

        public int ID;
        public String NombreCompleto;
        public int Edad;
        public String Direccion;
        public int Telefono;
        public String AreaTrabajo;
        public String TipoContrato;

}
