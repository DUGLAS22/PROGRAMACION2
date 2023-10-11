import java.util.Scanner;
class MenorMayor {
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new  Scanner(System.in);
        
        int num1, num2, num3, promedio, suma, producto, menor, mayor;
        
        System.out.print("Escribir el primer numero entero:");
        num1 = entrada.nextInt();
        
        System.out.print("Escribir el segundo numero entero:");
        num2 = entrada.nextInt();
        
        System.out.print("Escribir el tercer numero entero:");
        num3 = entrada.nextInt();
        
        suma = num1 + num2 + num3;
        promedio = (suma) / 3;
        producto = num1 * num2 * num3;
        
        System.out.printf("La suma es %d%n", suma);
        System.out.printf("El producto es %d%n", producto);
        System.out.printf("El promedio es %d%n", promedio);
        
        // Encontrando el numero mayor de los tres enteros
        if ((num1 > num2) && (num1 > num3))
        System.out.printf("El numero mayor es %d%n", num1);
        
        if ((num2 > num1) && (num2 > num3))
        System.out.printf("El numero mayor es %d%n", num2);
        
        if ((num3 > num1) && (num3 > num2))
        System.out.printf("El numero mayor es %d%n", num3);
        
        // encontrando el numero menor de los tres numeros
        if((num1 < num2) && (num1 < num3))
        System.out.printf("El numero menor es %d%n", num1);
        
        if((num2 < num1) && (num2 < num3))
        System.out.printf("El numero menor es %d%n", num2);
        
        if((num3 < num2) && (num3 < num2))
        System.out.printf("El numero menor es %d%n", num3);
    }
}