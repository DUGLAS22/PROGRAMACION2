import java.util.Scanner;
class PruebaEstudiante{
    public static void main (String[] args) {
        /* code */
        String nombre1, materia1,  cuenta1;
        int nota1;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INGRESE EL NUMERO DE CUENTA ESTUDIANTE: ");
        cuenta1 = entrada.nextLine();
        
        System.out.println("INGRESE EL NOMBRE DEL ESTUDIANTE: ");
        nombre1 = entrada.nextLine();
        
        System.out.println("INGRESE LA MATERIA DEL ESTUDIANTE: ");
        materia1 = entrada.nextLine();
        
        System.out.println("INGRESE LA NOTA DE LA MATERIA: " + materia1);   
        nota1 = entrada.nextInt();
        
        System.out.println("\n");
        
        Estudiante estudiante1 = new Estudiante(cuenta1, nombre1, materia1, nota1);
        
        System.out.println("LOS DATOS DEL ESTUDIANTE1 SON: CUENTA: " + estudiante1.obtenerCuenta() + " NOMBRE: " + estudiante1.obtenerNombre() +" MATERIA: " + estudiante1.obtenerMateria() + " NOTA: "  + estudiante1.obtenerCalificacion());
        System.out.println("\n");
        System.out.print("SU CALIFICACION ES: ");
        estudiante1.obtenerObservacion();
        System.out.println("\n");

        Estudiante estudiante2 = new Estudiante("cuenta1", "nombre1", "materia1", 78);
    }
}