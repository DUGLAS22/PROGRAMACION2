public class Rectangulo{
    private double longitud;
    private double anchura;
    
    public Rectangulo(){
        this.longitud = 1.0;
        this.anchura = 1.0;
    }
    
    public void setlongitud(double longitud){
        if((longitud < 20.0) && (longitud > 0.0)){
            this.longitud = longitud;
        }
    }
    public double getlongitud(){
        return longitud;
    }
    
    public void setanchura(double anchura){
         if((anchura < 20.0) && (anchura > 0.0)){
            this.anchura = anchura;
        }
       
    }
    
    public double getanchura(){
        return anchura;
    }
    
    public double Perimetro(){
        double perimetro;
        perimetro = 2 * (longitud + anchura);
        return perimetro;
    }
    
    public double area(){
        double area;
        area = this.longitud * anchura;
        return area;
    }
    
}