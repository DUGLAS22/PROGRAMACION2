import java.util.Scanner;
class Aritmetica{
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        int suma;
        int multi;
        int resta;
        int cociente;
        
        System.out.print("Escriba el primer numero entero:");
        num1 = entrada.nextInt();
        
        System.out.print("Escriba el segundo numero entero:");
        num2 = entrada.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        cociente = num1 / num2;
        
        System.out.printf("La suma es %d%n", suma);
        System.out.printf("La resta es %d%n", resta);
        System.out.printf("La multiplicacion es %d%n", multi);
        System.out.printf("El cociente es %d%n", cociente);
    }
}