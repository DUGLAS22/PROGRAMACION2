public class Estudiante{
    private String cuenta, nombre, materia, observacion;
    private int calificacion;
    public Estudiante(String cuenta, String nombre, String materia, int calificacion)
        {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.materia = materia;
        
        if((calificacion > 100) || (calificacion < 0)){
            this.calificacion = 0;
            System.out.println("DATOS DE LA CALIFICACION INCORRECTOS");
        }
        this.calificacion = calificacion;
        }   
    
    public void establecerCuenta(String cuenta){
        this.cuenta = cuenta;
    }
    
    public String obtenerCuenta(){
        return cuenta;
    }
    
    public void establecerNombre(){
        this.nombre = nombre;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerMateria(){
        this.materia = materia;
    }
    
    public String obtenerMateria(){
        return materia;
    }
    
    public void establecerCalificacion(){
        this.calificacion = calificacion;
    }
    
    public int obtenerCalificacion(){
        return calificacion;
    }

    public void obtenerObservacion(){

        if((this.calificacion >= 65) && (this.calificacion <= 100)){
            observacion = "APROBADO";
            System.out.println(observacion);
        }
        else{
             if((this.calificacion >= 0) && (this.calificacion < 65))
            observacion = "REPROBADO";
            System.out.println(observacion);
        }
    }
     }
     