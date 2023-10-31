class PruebaCuentaAhorro{
    public static void main (String[] args) {
        /* code */
          // Crear dos instancias de la clase CuentaDeAhorros
        cuentaAhorro ahorrador1 = new cuentaAhorro(2000.00);
        cuentaAhorro ahorrador2 = new cuentaAhorro(3000.00);
       // System.out.println("el saldo " + ahorrador1.getSaldo());

        // Establecer la tasa de interés anual en 4%
        cuentaAhorro.modificarTasaInteres(0.04);

        // Calcular el interés mensual para 12 meses
        for (int i = 1; i <= 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();
            System.out.println("Mes\tAhorrador1\tAhorrador2");
            System.out.printf("%d\t%.2f\t\t%.2f%n",i, ahorrador1.getSaldo(), ahorrador2.getSaldo());
           
        }
    
        // Cambiar la tasa de interés anual a 5%
        cuentaAhorro.modificarTasaInteres(0.05);

        // Calcular el interés del siguiente mes
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        System.out.println(" ");
        System.out.println("Nuevo Saldo despues de cambiar la tasa de interes en un mes");
        System.out.println("Ahorrador1\tAhorrador2");
        System.out.printf("%.2f\t\t%.2f",ahorrador1.getSaldo(), ahorrador2.getSaldo());
    }
}