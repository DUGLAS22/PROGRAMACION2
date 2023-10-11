import java.util.Scanner;
class ComparacionEnteros{
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.print("Escriba el primer numero entero:");
        num1 = entrada.nextInt();
        
        System.out.print("Escriba el segundo numero entero:");
        num2 = entrada.nextInt();
        
        if(num1==num2)
        System.out.printf("Estos numeros son iguales");
        
        if(num1 > num2)
        System.out.printf("Es mas grande el numero %d%n", num1);
       
        if(num1 < num2)
        System.out.printf("El numero mas grande es el  %d%n", num2);
        
    }
}