public class LineaFactura{
    private int cantidad;
    private String producto;
    private int  precio;
    //metodo constructor
    public LineaFactura(int cantidad, String producto, int precio){

        if(cantidad < 0){
        this.cantidad = 0;
        }else{
            this.cantidad = cantidad;
        }
        this.producto = producto;

         if(precio < 0){
            this.precio = 0;
        }else{
            this.precio = precio;
        }
    }
    public void setcantidad(){
        this.cantidad = cantidad;
    }

    public int getcantidad(){
        return cantidad;
    }
    public void setproducto(){
        this.producto = producto;
    }

    public String getproducto(){
        return producto;
    }

    public void setprecio(){
        this.precio = precio;
    }

    public int getprecio(){
        return precio;
    }

    public int getsubtotal(){
       return this.precio * this.cantidad;
    }

}