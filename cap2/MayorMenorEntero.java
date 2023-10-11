import java.util.Scanner;
class MayorMenorEntero {
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in);
         int num1, num2, num3, num4, num5;
         
         System.out.print("Ingrese el primer numero: ");
         num1 = entrada.nextInt();
         
         System.out.print("Ingrese el segundo numero: ");
         num2 = entrada.nextInt();
         
         System.out.print("Ingrese el tercer numero: ");
         num3 = entrada.nextInt();
         
         System.out.print("Ingrese el cuarto numero: ");
         num4 = entrada.nextInt();
         
         System.out.print("Ingrese el quinto numero: ");
         num5 = entrada.nextInt();
         
         //El numero mayor
        if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5))
        System.out.printf("El numero mayor es %d%n", num1);
        
        if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5))
        System.out.printf("El numero mayor es %d%n", num2);
        
        if ((num3 > num2) && (num3 > num1) && (num3 > num4) && (num3 > num5))
        System.out.printf("El numero mayor es %d%n", num3);
        
        if ((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5))
        System.out.printf("El numero mayor es %d%n", num4);
        
        if ((num5 > num1) && (num5 > num2) && (num5 > num3) && (num5 > num4))
        System.out.printf("El numero mayor es %d%n", num5);
        
        //El Numero Menor
        if((num1 < num2) && (num1 < num3) && (num1 < num4) && (num1 < num5))
        System.out.printf("El numero menor es %d%n", num1);
        
        if((num2 < num1) && (num2 < num3) && (num2 < num4) && (num2 < num5))
        System.out.printf("El numero menor es %d%n", num2);
        
        if((num3 < num1) && (num3 < num2) && (num3 < num4) && (num3 < num5))
        System.out.printf("El numero menor es %d%n", num3);
        
        if((num4 < num1) && (num4 < num2) && (num4 < num3) && (num4 < num5))
        System.out.printf("El numero menor es %d%n", num4);
        
        if((num5 < num1) && (num5 < num2) && (num5 < num3) && (num5 < num4))
        System.out.printf("El numero menor es %d%n", num5);
    }
}