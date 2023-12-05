
package conexion;

//de la clase creada

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexion {
     Connection cn;
     
     public Connection ConectarBD(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginproyecto","root","");
             System.out.println("Conexion Exitosa");
         }catch(Exception e){
             System.out.println("conexion fallida" + e);
         }
         return cn;
     }
}
