import java.util.ArrayList;
public class Factura{
    private String cliente;
    private  String fecha;
    private ArrayList<LineaFactura> lineafactura;
    public Factura(String cliente, String fecha){
        this.cliente = cliente;
        this.fecha = fecha;
        this.lineafactura = new ArrayList<LineaFactura>();
    }

     public void setcliente(){
        this.cliente = cliente;
    }

    public String getcliente(){
        return cliente;
    }

     public void setfecha(){
        this.fecha = fecha;
    }

    public String getfecha(){
        return fecha;
    }

    public void addlinefactura(LineaFactura linea){
        lineafactura.add(linea);
    }

    public int getTotal(){
        int total = 0;
        for(LineaFactura linea :lineafactura){
            total += linea.getsubtotal();
            
        }
        return total;
    }

    public ArrayList<LineaFactura> getlineafactura(){
        return lineafactura;
    }
}