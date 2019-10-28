public class Ejercicio03 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa  que muestra al azar el nombre de una carta de la baraja española: ");
                
        for (int i = 1; i <= 1; i++) {
          int baraja = ((int)(Math.random()*4) + 1);    
          
          switch (baraja) {
            case 1: 
              int espadas = ((int)(Math.random()*10) + 1); 
                switch (espadas){  
                case 1:
                  System.out.println("A de espadas"); 
                break;
                case 8:
                  System.out.println("Sota de espadas"); 
                break;
                case 9:
                  System.out.println("Caballo de espadas"); 
                break;
                case 10:
                  System.out.println("Rey de espadas"); 
                break;
                default: 
                  System.out.println(espadas +" de espadas");              
             }           
            break;
            case 2: 
             int oros = ((int)(Math.random()*10) + 1);    
             switch (oros){  
                case 1:
                  System.out.println("As de oros"); 
                break;
                case 8:
                  System.out.println("Sota de oros"); 
                break;
                case 9:
                  System.out.println("Caballo de oros"); 
                break;
                case 10:
                  System.out.println("Rey de oros"); 
                break;
                default: 
                  System.out.println(oros +" de oros");              
             }           
            break;
            case 3: 
             int copas = ((int)(Math.random()*10) + 1);    
             switch (copas){  
                case 1:
                  System.out.println("As de copas"); 
                break;
                case 8:
                  System.out.println("Sota de copas"); 
                break;
                case 9:
                  System.out.println("Caballo de copas"); 
                break;
                case 10:
                  System.out.println("Rey de copas"); 
                break;
                default: 
                  System.out.println(copas +" de copas");
             }
            break;
            case 4:
             int bastos = ((int)(Math.random()*10) + 1);    
                switch (bastos){  
                case 1:
                  System.out.println("As de bastos"); 
                break;
                case 8:
                  System.out.println("Sota de bastos"); 
                break;
                case 9:
                  System.out.println("Caballo de bastos"); 
                break;
                case 10:
                  System.out.println("Rey de bastos"); 
                break;
                default: 
                  System.out.println(bastos +" de bastos");
                }
            break;                
           }
      }
  }
}
