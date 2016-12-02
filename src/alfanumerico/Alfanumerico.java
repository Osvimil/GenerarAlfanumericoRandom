
package alfanumerico;


public class Alfanumerico {

    
    public static void main(String[] args) {
        char[] chr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
		char[] aleatorio=new char[20];
                
                
                
                for (int x = 0; x <chr.length; x++) {
                    System.out.println(x);
                    //CALCULA EL TAMAÑO DEL ARREGLO
            
        }
 
                for(int i=0;i<=19;i++){
                aleatorio[i]=chr[(int)(Math.random()*35)];
                System.out.print(aleatorio[i]);
                //GENERA LA CADENA ALFANUMERICA DE ACUERDO AL ARREGLO DE TIPO CHAR
                }       
    }
    
}
