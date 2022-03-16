package Colegio;

import java.util.Scanner;

public class App {
    public static void main(String[]args){

        Alumno alumno1 = new Alumno(1,"Pedro Perez",15,"cra 11",8515612,6,150000
        );
        System.out.println("Información del estudiante: -ID " + alumno1.ID +" -Nombre Completo: "+alumno1.NombreCompleto + " -Edad: " +alumno1.Edad + " -Telefono: " +alumno1.Telefono + " -Año escolar: " + alumno1.AñoEscolar + " -Valor pension: " + alumno1.ValorPension);

        Administrativo administrativo1 = new Administrativo(1,"Pepito Hernandez",35,"cale 15",369887894,"Recursos humanos","termino fijo");
        System.out.println("Información del Administrativo: -ID " + administrativo1.ID +" -Nombre Completo: "+administrativo1.NombreCompleto + " -Edad: " +administrativo1.Edad + " -Telefono: " +administrativo1.Telefono + " -Area de trabajo: " + administrativo1.AreaTrabajo + " -Tipo de contrato: " + administrativo1.TipoContrato);


        int N;

        Scanner teclado = new Scanner(System.in);
        N = teclado.nextInt();

        if (N == 1 ){
            System.out.println("- Tipo de usuario: Estudiante " + "- medio de transporte: Ruta escolar " + " - Horario : 7 am - 3 pm");
        }
        if (N == 2){
            System.out.println("- Tipo de usuario: Administrativo " + "- medio de transporte: Transmilenio " + " - Horario : 7 am - 5 pm");
        } else {
            System.out.println("Error");
        }
    }
}
