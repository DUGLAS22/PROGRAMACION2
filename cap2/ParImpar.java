import java.util.Scanner;
class ParImpar{
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in);
        
        int num, par, impar;
        
        System.out.printf("Ingrese un numero");
        num = entrada.nextInt();
        
        par = num % 2;
        impar = num % 2;
        
        if(par == 0)
        System.out.printf("Es par");
        
        if(impar == 1)
        System.out.printf("Es impar");
    }
}