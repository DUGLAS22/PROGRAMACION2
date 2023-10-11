import java.util.Scanner;
class PruebaFactura{
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in); 
        String nameCliente, descripcionPieza, codigoPieza;
        int cantidaddePieza;
        double preciodePieza;
        
        System.out.println("NOMBRE DEL CLIENTE: ");
        nameCliente = entrada.nextLine();
        
        System.out.println("DESCRIPCION DE LA PIEZA: ");
        descripcionPieza = entrada.nextLine();
        
        System.out.println("CODIGO DE LA PIEZA: ");
        codigoPieza = entrada.nextLine();
        
        System.out.println("CANTIDAD DE PIEZA QUE LLEVA EL CLIENTE: " + nameCliente);
        cantidaddePieza = entrada.nextInt();
        
        System.out.println("PRECIO POR PIEZA: ");
        preciodePieza = entrada.nextDouble();
        
       // System.out.println(descripcionPieza);
       Factura Factura1 = new Factura(codigoPieza, descripcionPieza, cantidaddePieza, preciodePieza);
       System.out.println(" \n");
       System.out.println("LA FACTURA DEL CLIENTE: " + nameCliente);
       System.out.println("LLEVA:  " + Factura1.obtenerdesPieza());
       System.out.println("CON CODIGO: " + Factura1.obtenernumPieza());
       System.out.println("LA CANTIDAD: " + Factura1.obternercantidadArticulo());
       System.out.printf("CON PRECIO CADA UNIDAD: $%.2f%n",Factura1.obternerprecioArticulo());
       //System.out.println("TOTAL A PAGAR ES DE: " + Factura1.obtenerMontoFactura(cantidaddePieza,preciodePieza));
       System.out.printf("TOTAL A PAGAR ES DE: $%.2f%n%n",Factura1.obtenerMontoFactura(cantidaddePieza,preciodePieza));
    }
}