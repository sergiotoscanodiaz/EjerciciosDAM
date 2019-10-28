public class Ejercicio02 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa  que muestra al azar el nombre de una carta de la baraja francesa: ");
               
        for (int i = 1; i <= 1; i++) {
          int baraja = ((int)(Math.random()*4) + 1);    
          
          switch (baraja) {
            case 1: 
              int picas = ((int)(Math.random()*13) + 1); 
                switch (picas){  
                case 1:
                  System.out.println("A de picas"); 
                break;
                case 11:
                  System.out.println("J de picas"); 
                break;
                case 12:
                  System.out.println("Q de picas"); 
                break;
                case 13:
                  System.out.println("K de picas"); 
                break;
                default: 
                  System.out.println(picas +" de picas");              
             }           
            break;
            case 2: 
             int corazones = ((int)(Math.random()*13) + 1);    
             switch (corazones){  
                case 1:
                  System.out.println("A de corazones"); 
                break;
                case 11:
                  System.out.println("J de corazones"); 
                break;
                case 12:
                  System.out.println("Q de corazones"); 
                break;
                case 13:
                  System.out.println("K de corazones"); 
                break;
                default: 
                  System.out.println(corazones +" de corazones");              
             }           
            break;
            case 3: 
             int diamantes = ((int)(Math.random()*13) + 1);    
             switch (diamantes){  
                case 1:
                  System.out.println("A de diamantes"); 
                break;
                case 11:
                  System.out.println("J de diamantes"); 
                break;
                case 12:
                  System.out.println("Q de diamantes"); 
                break;
                case 13:
                  System.out.println("K de diamantes"); 
                break;
                default: 
                  System.out.println(diamantes +" de diamantes");
             }
            break;
            case 4:
             int tréboles = ((int)(Math.random()*13) + 1);    
             switch (tréboles){  
                case 1:
                  System.out.println("A de tréboles"); 
                break;
                case 11:
                  System.out.println("J de tréboles"); 
                break;
                case 12:
                  System.out.println("Q de tréboles"); 
                break;
                case 13:
                  System.out.println("K de tréboles"); 
                break;
                default: 
                  System.out.println(tréboles +" de tréboles");
             }
            break;
          }       
        }
  }
}
