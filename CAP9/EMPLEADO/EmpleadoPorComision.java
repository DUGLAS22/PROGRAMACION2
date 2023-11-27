public class EmpleadoPorComision extends Empleado{
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision){
    
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if(ventasBrutas < 0.0){
            throw new IllegalArgumentException("VENTAS BRUTAS DEBE SER >= 0.0");
        }else{
            this.ventasBrutas = ventasBrutas;
        }

        if((tarifaComision <= 0.0) || (tarifaComision >= 1.0)){
            throw new IllegalArgumentException("LA TARIFA DE COMISION DEBE SER > 0.0 Y < 1.0");
        }else{
            this.tarifaComision = tarifaComision;
        }
    }

    public void setventasBrutas( double ventasBrutas){
        if(ventasBrutas < 0.0 )
         throw new IllegalArgumentException("VENTAS BRUTAS DEBE SER >= 0.0");

         this.ventasBrutas = ventasBrutas;
    }

    public double getventasBrutas(){
        return ventasBrutas;
    }

    public void settarifaComision( double tarifaComision){
        if((tarifaComision <= 0.0) || (tarifaComision >= 1.0))
            throw new IllegalArgumentException("LA TARIFA DE COMISION DEBE SER > 0.0 Y < 1.0");

            this.tarifaComision = tarifaComision;
    }

    public double gettarifaComision(){
        return tarifaComision;
    }

    public double ingresos(){
        return gettarifaComision() * getventasBrutas();
    }

    @Override
    public String toString(){

        return String.format("%s : %.2f : %.2f% n",super.toString(), "VENTAS BRUTAS", getventasBrutas(), "TARIFA DE COMISION", gettarifaComision());
    }

}