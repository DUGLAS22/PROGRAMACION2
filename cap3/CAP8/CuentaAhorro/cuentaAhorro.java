public class cuentaAhorro {
    private static double tasaInteresAnual;
    private double saldo;

    public cuentaAhorro(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void calcularInteresMensual() {
        double interesMensual = (saldo * tasaInteresAnual) / 12;
        saldo += interesMensual;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    public static double getTasaInteresAnual() {
        return tasaInteresAnual;
    }
}
