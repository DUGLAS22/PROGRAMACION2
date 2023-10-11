import java.util.Scanner;
class Multiplo {
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, resto;
        
         System.out.print("Escribir el primer numero entero:");
        num1 = entrada.nextInt();
        
        System.out.print("Escribir el segundo numero entero:");
        num2 = entrada.nextInt();    
        
        resto = num1 % num2;
        
        if (resto == 0)
        System.out.printf( num1 + " Si es multiplo de %d%n",num2);
        
         if (resto != 0)
        System.out.printf( num1 + " no es multiplo de %d%n",num2);
        
    }
}