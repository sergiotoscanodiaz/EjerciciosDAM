public class Ejercicio07 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que muestra tres apuestas de la quiniela: ");
    
     for (int i = 1; i <= 14; i++) {
       int quiniela = ((int)(Math.random()*3) + 1);    
       
       switch (quiniela) {         
        
         case 1:
           System.out.println(1); 
         break;
         case 2:
           System.out.println("x"); 
         break;
         case 3:
           System.out.println(2);
         break;
         
       }
                     
     }
    
   
  }
}
