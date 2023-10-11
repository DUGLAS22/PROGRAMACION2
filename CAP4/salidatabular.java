import java.util.Scanner;
class salidaTabular {
    public static void main (String[] args) {
        /* code */
        int num = 1;
        System.out.println("TABLA DE VALORES DEL 1 AL 5");
        while(num <= 5){
            System.out.print("N: " + num + "     ");
            //System.out.println(num);
            int decena = 10 *num;
            System.out.print("10 * N: " + decena + "     ");
            int centena = 100 * num;
            System.out.print("100 * N: " + centena + "     ");
            int mil = 1000 * num;
            System.out.print("1000 * N: " + mil + "     ");
           // System.out.println(decena);
            //System.out.println(centena);
            //System.out.println(mil);
            System.out.println();
            num++;
            
        }
        
    }
}