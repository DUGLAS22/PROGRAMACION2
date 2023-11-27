public class Empleado{
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial){
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    public String getprimerNombre(){
        return primerNombre;
    }
    
    public String getapellidoPaterno(){
        return apellidoPaterno;
    }
    
    public String getnumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s: %s%n%s", "EMPLEADO", getprimerNombre(), "APELLIDO", getapellidoPaterno(),
        "NUMERO DE SEGURO SOCIAL", getnumeroSeguroSocial());
    }
}