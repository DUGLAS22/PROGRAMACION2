
public class PruebaEmpleado{
    public static void main (String[] args) {
        /* code */
        EmpleadoPorHora empleado1 = new EmpleadoPorHora("BOB", "GARCIA", "333-33-3333", 8.0, 60.0);
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("DANIEL", "BUSTILLO", "2022-1900-141", 56.0, 60.0);
        EmpleadoPorHora empleado3 = new EmpleadoPorHora("ANA", "SALINAS", "2021-3455-906", 70.0, 60.0);
        EmpleadoPorComision empleadoComision1 = new EmpleadoPorComision("JUAN", "LEWIS", "2023-2432-234", 3000, 0.04);
        System.out.println("DATOS DEL EMPLEADO PAGO POR HORA");
        System.out.println("NOMBRE\tAPELLIDO\tNUMERO SEGURO SOCIAL\tHORAS TRABAJADAS\t SUELDO POR HORAS TRABAJADAS\t TOTAL A PAGAR");
        System.out.printf("%S\t %s\t\t %s\t\t%.2f\t\t\t%.2f\t\t\t\t%.2f%n", empleado1.getprimerNombre(), empleado1.getapellidoPaterno(), empleado1.getnumeroSeguroSocial(),
        empleado1.gethorasTrabajadas(), empleado1.getsuelHora(), empleado1.ingresos());

        System.out.printf("%S\t %s\t %s\t\t%.2f\t\t\t%.2f\t\t\t\t%.2f%n", empleado2.getprimerNombre(), empleado2.getapellidoPaterno(), empleado2.getnumeroSeguroSocial(),
        empleado2.gethorasTrabajadas(), empleado2.getsuelHora(), empleado2.ingresos());

        System.out.printf("%S\t %s\t %s\t\t%.2f\t\t\t%.2f\t\t\t\t%.2f%n", empleado3.getprimerNombre(), empleado3.getapellidoPaterno(), empleado3.getnumeroSeguroSocial(),
        empleado3.gethorasTrabajadas(), empleado3.getsuelHora(), empleado3.ingresos());

        System.out.println("\n");
        System.out.println("DATOS DEL EMPLEADO PAGO POR COMISION");
        System.out.println("NOMBRE\tAPELLIDO\tNUMERO SEGURO SOCIAL\tVENTAS\t\tTARIFA COMISION\t TOTAL");
        System.out.printf("%s\t %s\t\t %s\t\t %.2f\t %.2f\t\t %.2f%n ",empleadoComision1.getprimerNombre(), empleadoComision1.getapellidoPaterno(),
        empleadoComision1.getnumeroSeguroSocial(), empleadoComision1.getventasBrutas(), empleadoComision1.gettarifaComision(),
        empleadoComision1.ingresos());
       
        
    }
}