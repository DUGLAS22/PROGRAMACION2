public class Fecha{
    private int dia, a, mes;
    //metodo constructor
    public Fecha(int dia, int mes, int a)
        {
            //condicion de dia
            if((dia  > 30) || (dia < 1))
            {
            this.dia = 0;
            System.out.println("DIA INGRESADO INCORECTO");
            }else
            {
            this.dia = dia;
            }
            
            //CONDICION DE MES
            if((mes  > 12) || (mes < 1))
            {
            this.mes = 0;
            System.out.println("MES INGRESADO INCORECTOS");
            }else
            {
            this.mes = mes;
            }
            

            //condicion año
            if((a  > 2023) || (a < 2000))
            {
            this.a = 0;
            System.out.println("EL AÑO INGRESADO ES INCORRECTO ES MAYOR QUE 2023 O MENOR QUE 2000");
            System.out.println("\n");
            }else
            {
            this.a = a;
            }
        }
       
        public void establecerDia(){
            this.dia = dia;
        }

        public int obtenerDia(){
            return dia;
        }

        public void establecerMes(){
            this.mes = mes;
        }

        public int obtenerMes(){
            return mes;
        }

        public  void establecerAn(){
            this.a = a;
        }

        public int obtenerAn(){
            return a;
        }

   public int sumaDia( int dia1, int dia2, int mes1, int mes2, int a1, int a2){
    int totalDia = 0;
    // LA FECHA1 ES MAYOR
    if((dia1 >= dia2) && (mes1 >= mes2) && (a1 >= a2))
    {
    int calDia = dia1 - dia2;
    int diaMes = (mes1 - mes2) * 30;
    int diaA = (a1 - a2) * 365;
    totalDia = calDia + diaMes + diaA; 
   }

   //LA FECHA2 ES MAYOR
    if((dia2 >= dia1) && (mes2 >= mes1) && (a2 >= a1))
    {
    int calDia = dia2 - dia1;
    int diaMes = (mes2 - mes1) * 30;
    int diaA = (a2 - a1) * 365;
    totalDia = calDia + diaMes + diaA; 
   }  

    //LA FECHA2 DIA MAYOR Y FECHA1 MES Y AÑO MAYOR
    if((dia2 >= dia1) && (mes1 >= mes2) && (a1 >= a2))
    {
    int calDia = dia2 - dia1;
    int diaMes = (mes1 - mes2) * 30;
    int diaA = (a1 - a2) * 365;
    totalDia = calDia + diaMes + diaA; 
   }  

   //LA FECHA1 DIA MAYOR Y FECHA2 MES Y AÑO MAYOR
    if((dia1 >= dia2) && (mes2 >= mes1) && (a2 >= a1))
    {
    int calDia = dia1 - dia2;
    int diaMes = (mes2 - mes1) * 30;
    int diaA = (a2 - a1) * 365;
    totalDia = calDia + diaMes + diaA; 
   }

   // LA FECHA2 DIA Y MES MAYOR  Y FECHA1 MENOR AÑO
  if((dia2 >= dia1) && (mes2 >= mes1) && (a1 >= a2))
    {
    int calDia = dia2 - dia1;
    int diaMes = (mes2 - mes1) * 30;
    int diaA = (a1 - a2) * 365;
    totalDia = calDia + diaMes + diaA; 
   }

   // LA FECHA1 DIA Y MES MAYOR  Y FECHA2 MENOR AÑO
  if((dia1 >= dia2) && (mes1 >= mes2) && (a2 >= a1))
    {
    int calDia = dia1 - dia2;
    int diaMes = (mes1 - mes2) * 30;
    int diaA = (a2 - a1) * 365;
    totalDia = calDia + diaMes + diaA; 
   }

    // LA FECHA1 DIA Y AÑO MAYOR  Y FECHA2 MENOR MES
  if((dia1 >= dia2) && (mes1 >= mes2) && (a1 >= a1))
    {
    int calDia = dia1 - dia2;
    int diaMes = (mes1 - mes2) * 30;
    int diaA = (a1 - a2) * 365;
    totalDia = calDia + diaMes + diaA; 
   }

    // LA FECHA2 DIA Y AÑO MAYOR  Y FECHA1 MENOR MES
  if((dia2 >= dia1) && (mes2 >= mes1) && (a2 >= a1))
    {
    int calDia = dia2 - dia1;
    int diaMes = (mes2 - mes1) * 30;
    int diaA = (a2 - a1) * 365;
    totalDia = calDia + diaMes + diaA; 
   }

    // LA FECHA1 DIA Y MES MAYOR  Y FECHA2 MAYOR AÑO
  if((dia1 >= dia2) && (mes1 >= mes2) && (a2 >= a1))
    {
    int calDia = dia1 - dia2;
    int diaMes = (mes1- mes2) * 30;
    int diaA = (a2 - a1) * 365;
    totalDia = calDia + diaMes + diaA; 
   }
    return totalDia;
   }        
}