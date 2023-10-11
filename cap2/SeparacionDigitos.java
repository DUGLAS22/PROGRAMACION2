import java.util.Scanner;
class SeparacionDigitos {
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in);
        
        int numero, digito1, digito2, digito3, digito4, digito5, resto1, resto2, resto3, resto4;
        
        System.out.print("Ingrese un numero de 5 digitos");
        numero = entrada.nextInt();
    
        digito1 = (numero / 10000);
        resto1 = numero % 10000;
        digito2 = resto1 / 1000;
        resto2 = resto1 % 1000;
        digito3 = resto2 / 100;
        resto3 = resto2 % 100;
        digito4 = resto3 / 10;
        resto4 = resto3 % 10;
        digito5 = resto4;
    
        System.out.println("El primer digito es " + digito1);
        //System.out.println(resto1);
        System.out.println("El segundo digito es " + digito2);
        //System.out.println(resto2);
        System.out.println("El tercer digito es " + digito3);
        System.out.println("El cuarto digito es " + digito4);
        System.out.println("El quinto digito es " + digito5);
    }
}