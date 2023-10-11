import java.util.Scanner;
class DiametroAreaCircun {
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in);
        
        int radio;
        
        System.out.print("Ingrese el radio");
        radio = entrada.nextInt();
        
        System.out.printf("El diametro es %d%n", (2 * radio));
        System.out.printf("La circunferencia es %f%n", (2 * radio * Math.PI));
        System.out.printf("El area es %f", (radio * radio * Math.PI));
    }
}