import java.util.Scanner;
class PruebaCuenta {
    public static void main (String[] args) {
        /* code */
        Cuenta cuenta1 = new Cuenta("Jane Green", 500.00);
        Cuenta cuenta2 = new Cuenta("Jonh Blue", -7.53);
        
        Scanner entrada = new Scanner(System.in);
        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n",cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador (promt)
        double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",montoDeposito);
        cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2
        // muestra los saldos
        System.out.print("Escriba el monto a retirar para cuenta1: ");
        double montoRetirar = entrada.nextDouble();
         System.out.println(montoRetirar);
        System.out.printf("%nrestando %.2f al saldo de cuenta1%n%n",montoRetirar);
        cuenta1.retirar(montoRetirar); // resta al saldo de cuenta1
       

        System.out.printf("Saldo de %s: $%.2f%n",cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
    }
}