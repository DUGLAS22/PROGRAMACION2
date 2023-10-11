public class Cuenta {
    private String name;
    private double saldo;
    
    public Cuenta(String name, double saldo)
    {
        this.name = name;
        if(saldo > 0.0)
        this.saldo = saldo;
    }
    public void depositar(double montoDeposito)
    {
        if(montoDeposito > 0.0)
        saldo = saldo + montoDeposito;
    }

    public void retirar(double montoRetirar)
    {
        if(montoRetirar <= saldo)
        {
        saldo = saldo - montoRetirar;
        }else{
            saldo = saldo;
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        }

    }
    
    public  double obtenerSaldo(){
        return saldo;
    }
    
    public void establecerNombre()
    {
        this.name = name;
    }
    
    public String obtenerNombre(){
        return name;
    }
    
    
}