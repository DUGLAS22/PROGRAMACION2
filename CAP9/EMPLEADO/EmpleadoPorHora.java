public class EmpleadoPorHora extends Empleado{
    private double horasTrabajadas;
    private double sueldHora;
    
    public EmpleadoPorHora(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double horasTrabajadas, double sueldHora)
        {
            super(primerNombre, apellidoPaterno, numeroSeguroSocial);
            if(sueldHora < 0.0){
                throw new IllegalArgumentException("EL SALARIO POR HORA DEBE SER >= 0.0");
            }else{
                this.sueldHora = sueldHora;
            }
        
            if((horasTrabajadas < 0.0) || (horasTrabajadas > 168.0)){
                throw new IllegalArgumentException("LAS HORAS TRABAJADAS NO ESTAN ENTRE 0 Y 168 (TOTAL DE HORAS EN UNA SEMAN)");
            }else{
                this.horasTrabajadas = horasTrabajadas;
            }
        }
        
        public void setsuelHora(double suelHora){
            if(sueldHora < 0.0)
            throw new IllegalArgumentException("EL SALARIO POR HORA DEBE SER >= 0.0");
            
            this.sueldHora = sueldHora;
        }
        
        public double getsuelHora(){
            return sueldHora;
        }
        
        public void sethorasTrabajadas( double horasTrabajadas){
            if((horasTrabajadas < 0.0) || (horasTrabajadas > 168.0))
            throw new IllegalArgumentException("LAS HORAS TRABAJADAS NO ESTAN ENTRE 0 Y 168 (TOTAL DE HORAS EN UNA SEMAN)");
        
            this.horasTrabajadas = horasTrabajadas;
        }
        
        public double gethorasTrabajadas(){
            return horasTrabajadas;
        }
        
        public double ingresos(){
            return gethorasTrabajadas() * getsuelHora();
        }
        
        @Override
        public String toString(){
            return String.format("%s%n: %.2f: %.2f",super.toString(), "HORAS TRABAJADAS", gethorasTrabajadas(),
            "SUELDO POR HORAS TRABAJADAS $", getsuelHora());
        }
}