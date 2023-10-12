import java.util.Scanner;

public class enteromayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int mayor = Integer.MIN_VALUE; // Inicializar mayor con el valor mínimo de un entero
        
        while (contador <= 10) {
            System.out.print("INGRESE UN NUMERO ENTERO: ");
            int numero = entrada.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            
            contador++;
        }
        
        System.out.println("EL NUMERO MAS GRANDE ES: " + mayor);
    }
}