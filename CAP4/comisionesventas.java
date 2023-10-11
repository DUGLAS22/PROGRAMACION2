import java.util.Scanner;
class comisionesVentas{
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in);
        String vendedor;
        double total = 0.0;
        int contadorArticulo = 0;
        double pagoSemanal = 200.0;
        double totalPagar = 0.0;
        
        System.out.print("NOMBRE DEL VENDEDOR");
        vendedor = entrada.nextLine();
        
        // fase de procesamiento
        System.out.println("INGRESE EL PRECIO DEL ARTICULO O 0 PARA TERMINAR");
        double precio = entrada.nextDouble();
        
    while(precio != 0){
        total = total + precio;
        contadorArticulo++;
        System.out.println("INGRESE EL PRECIO DEL ARTICULO O 0 PARA TERMINAR");
        precio = entrada.nextDouble();  
    }
    
    System.out.println();

    if(contadorArticulo != 0){
        System.out.println("EL TOTAL VENDIDO POR " + vendedor);
        System.out.println("CANTIDAD DE ARTICULOS: " + contadorArticulo);
        System.out.printf("SEMANAL ES DE $%.2f%n", total);
    }
    else{
        System.out.println(vendedor + " NO  VENDIO ARTICULOS ESTA SEMANA");
    }
    
    double pagoComision = total * 0.09;
    totalPagar = pagoSemanal + pagoComision;
    System.out.println("EL TOTAL A PAGAR A "+ vendedor + " INCLUYENDO EL PAGO SEMANAL MAS LA COMISION DE VENTA SEMANAL");
    System.out.printf("ES DE $%.2f%n", totalPagar);
}
}