import java.util.Scanner;
 class PruebaFactura{
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Scanner entrada2 = new Scanner(System.in);
        String cliente1, cliente2;
        String fecha1, fecha2 ; 
        int  contador = 0;
        System.out.println(" ");
        System.out.println ("INGRESE EL NOMBRE DEL CLIENTE EN LA FACTURA1");
        cliente1 = entrada.nextLine();
        System.out.println ("INGRESE LA FECHA QUE REALZO LA FACTURA1");
        fecha1 = entrada.nextLine();

        System.out.println(" ");
        System.out.println ("INGRESE EL NOMBRE DEL CLIENTE EN LA FACTURA2");
        cliente2 = entrada2.nextLine();
        System.out.println ("INGRESE LA FECHA QUE REALZO LA FACTURA2");
        fecha2 = entrada.nextLine();

        Factura factura1 = new Factura(cliente1, fecha1);
        Factura factura2 = new Factura(cliente2, fecha2);
        System.out.println(" ");
        System.out.println("INGRESE 1 SI VA A AGEGAR PRODUCTOS A LA FACTURA2 O 0 SI NO");
        int id = entrada.nextInt();

        while(id != 0){
             System.out.println("INGRESE EL  PRODUCTO");
                String producto = entrada2.nextLine();
                System.out.println("INGRESE EL PRECIO DEL PRODUCTO");
                int precio = entrada.nextInt();
                System.out.println("INGRESE LA CANTIDAD A LLEVAR");
               int  c = entrada.nextInt();
                contador++;
            factura2.addlinefactura(new LineaFactura( c, producto, precio));
        System.out.println(" ");
        System.out.println("INGRESE 1 SI VA A SEGUIR AGREGANDO MAS PRODUCTO A LA FACTURA2 O 0 SI NO");
        id = entrada.nextInt();
        }
        factura1.addlinefactura(new LineaFactura(1, "Lamina", 234));
        factura1.addlinefactura(new LineaFactura(2, "Canaleta", 150));
        int total1 = factura1.getTotal();
        int total2 = factura2.getTotal();
        System.out.println(" ");
        System.out.println("LA FACTURA1 ES  DEL CLIENTE: " + factura1.getcliente());
        System.out.println("LA FACTURA1 FUE REALIZADA " + factura1.getfecha());
        System.out.println(" DETALLES DE LA FACTURA");
        System.out.println("CANTIDAD\tPRODUCTO\tPRECIO");
         for(LineaFactura linea :factura1.getlineafactura()){
        System.out.printf("%d\t\t%s\t%d%n",linea.getcantidad(), linea.getproducto(), linea.getprecio());
        }
        System.out.println("EL TOTAL A PAGAR ES DE $ "+ total1);
         System.out.println(" ");
         
        System.out.println(" ");
        System.out.println("LA FACTURA2 ES DEL CLIENTE: " + factura2.getcliente());
        System.out.println("LA FACTURA2 FUE REALIZADA " + factura2.getfecha());
        System.out.println(" DETALLES DE LA FACTURA");
        System.out.println("CANTIDAD\tPRODUCTO\tPRECIO");
         for(LineaFactura linea :factura2.getlineafactura()){
        System.out.printf("%d\t\t%s\t\t%d%n",linea.getcantidad(), linea.getproducto(), linea.getprecio());
        }
        System.out.println("EL CLIENTE LLEVA: "+ contador + " PRODUCTO");
        System.out.println("EL TOTAL A PAGAR ES DE $ "+ total2);
       
    }
}


