class Misterio2 {
    public static void main (String[] args) {
        /* code */
        /* EL CODIGO LO QUE IMPRIME ES QUE REALIZA UN CICLO 10 VECES Y REALIZA UNA CONDICION
        EN CADA ITERACION Y MUESTRA EN PANTALLA !!! CUANDO EL RESTO ES 1 O CUANDO EL NUMERO 
        ES IMPAR Y CUANDO EL RESTO ES O IMPRIME +++ O CUANDO ES PAR*/
        int cuenta = 1;
        
     while(cuenta <= 10){
         System.out.println(cuenta);
         System.out.println( cuenta % 2 == 1 ? "!!!":"+++");
         ++cuenta;
     }    
    }
}