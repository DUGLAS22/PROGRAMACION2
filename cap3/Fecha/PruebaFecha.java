
import java.util.Scanner;
public class PruebaFecha {
    public static void main(String[] args) {
        int dia1, dia2, mes1, mes2, a1, a2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL DIA FECHA1:");
        dia1 = entrada.nextInt();

        System.out.println("INGRESE EL MES FECHA1: ");
        mes1 = entrada.nextInt();

        System.out.println("INGRESE EL AÑO FECHA1: ");
        a1 = entrada.nextInt();

        System.out.println("\n");

        System.out.println("INGRESE EL DIA FECHA2: ");
        dia2 = entrada.nextInt();

        System.out.println("INGRESE EL MES FECHA2: ");
        mes2 = entrada.nextInt();

        System.out.println("INGRESE EL AÑO FECHA2: ");
        a2 = entrada.nextInt();
        Fecha fecha1 = new Fecha(dia1, mes1, a1);
        Fecha fecha2 = new Fecha(dia2, mes2, a2);

        System.out.println("\n");
        System.out.println("LA FECHA1 ES: "+ fecha1.obtenerDia() + " / " + fecha1.obtenerMes() + " / " + fecha1.obtenerAn());
        System.out.println("LA FECHA2 ES: "+ fecha2.obtenerDia() + " / " + fecha2.obtenerMes() + " / " + fecha2.obtenerAn());

        System.out.println("\n");
        System.out.println("TOTAL DE DIAS  DE LAS 2 FECHAS ES DE: " + fecha1.sumaDia(dia1, dia2, mes1, mes2, a1, a2) + " DIAS");
        System.out.println("\n");
    }
}
