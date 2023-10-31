import java.util.Scanner;
class PruebaRectangulo{
    public static void main (String[] args) {
        /* code */
        Scanner i = new Scanner(System.in);
        double l1, l2, a1, a2;
        
        Rectangulo Rectangulo1 = new Rectangulo();
        Rectangulo Rectangulo2 = new Rectangulo();
        System. out.println("INGRESE LA LONGITUD DEL RECTANGULO 2");
        l2 = i.nextDouble();
        System. out.println("INGRESE LA ANCHURA DEL RECTANGULO 2");
        a2 = i.nextDouble();
        
        Rectangulo1.setlongitud(6.0);
        Rectangulo1.setanchura(2.3);
        Rectangulo2.setanchura(a2);
        Rectangulo2.setlongitud(l2);
        
        l1 = Rectangulo1.getlongitud();
        a1 = Rectangulo1.getanchura();
        Rectangulo2.getlongitud();
        Rectangulo2.getanchura();
        System.out.printf("EL PERIMETRO DEL RECTANGULO 1 ES %.2f%n", Rectangulo1.Perimetro());
        System.out.printf("EL AREA DEL RECTANGULO 1 ES %.2f%n", Rectangulo1.area());
        System.out.printf("EL PERIMETRO DEL RECTANGULO 2 ES %.2f%n", Rectangulo2.Perimetro());
        System.out.printf("EL AREA DEL RECTANGULO 2 ES %.2f%n", Rectangulo2.area());
    }
}