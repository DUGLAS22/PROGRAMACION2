import java.util.Scanner;
class enteroMenor{
    public static void main (String[] args) {
        /* code */
        Scanner entrada = new Scanner(System.in);
        int num;
        int contador = 1;
        int menor = Integer.MAX_VALUE;
        
        while(contador <= 10){
            System.out.print("INGRESE UN NUMERO ENTERO: ");
            num = entrada.nextInt();
            
            if (num < menor) {
                menor = num;
            }
            
            contador++;
        }
        System.out.println("EL NUMERO MAS PEQUEÑO ES: " + menor);
    }
}