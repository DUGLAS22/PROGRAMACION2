import java.util.Scanner;
class factorial {
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in);
        int num;
        long fact = 1;
        
        System.out.println("INGRESE EL NUMERO A CALCULAR EL FACTORIAL");
        num = entrada.nextInt();
        int numguar = num;
        while(num != 0){
            fact = num * fact;
            num--;
        }
        System.out.println("EL FACTORIAL DEL NUMERO: " +  numguar + " ES: " + fact);

        
    }
}