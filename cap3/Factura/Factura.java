public class Factura{
    private String numPieza;
    private String desPieza;
    private int cantidadArticulo;
    private double precioArticulo;
    
    public Factura(String numPieza, String desPieza, int cantidadArticulo, double precioArticulo)
    {
        this.numPieza = numPieza;
        this.desPieza = desPieza;
        
        if(cantidadArticulo < 0){
        this.cantidadArticulo = 0;
        }else{
            this.cantidadArticulo = cantidadArticulo;
        }
        
        if(precioArticulo < 0.0){
            this.precioArticulo = 0.0;
        }else{
            this.precioArticulo = precioArticulo;
        }
    }
    
    public void establecernumPieza()
    {
        this.numPieza =numPieza; 
    }
    
    public String obtenernumPieza()
    {
        return numPieza;
    }
    
    public void establecerdesPieza(){
        this.desPieza = desPieza;
    }
    
    public String obtenerdesPieza(){
        return desPieza;
    }
    
    public void establecercantidadArticulo(){
        this.cantidadArticulo = cantidadArticulo;
    }
    
    public int obternercantidadArticulo(){
        return cantidadArticulo;
    }
    
    public void establecerprecioArticulo(){
        this.precioArticulo = precioArticulo;
    }
    
    public double obternerprecioArticulo(){
        return precioArticulo;
    }
    
    public double obtenerMontoFactura(int cantidadArticulo, double precioArticulo)
    {
        double total = 0;
        if((cantidadArticulo < 0) && (precioArticulo < 0 ))
        {
            total = 0;
        }
        if((cantidadArticulo < 0) || (precioArticulo < 0 ))
            {
                total = 0;
            }
        else{
            total = cantidadArticulo * precioArticulo;
        }
        //double total = cantidadArticulo * precioArticulo;
        return total;
    }
}