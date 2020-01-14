public class Ejercicio01 {
  
  public static void main(String[] args) {
    
    int altura = aleatorioImpar(3, 15);
    
    //Parte de arriba
    System.out.println("*    *   *****   *        ****");
    
    for(int i = 0; i < (altura - 3)/2; i++){
      System.out.println("*    *   *   *   *       *    *");
    }
    
    //Parte media
    System.out.println("******   *   *   *       ******");
    
    for(int i = 0; i < (altura - 3)/2; i++){
      System.out.println("*    *   *   *   *       *    *");
    }
    
    //Parte de abajo
    System.out.println("*    *   *****   ******  *    *");
    } 
    
    //FUNCIONES////////////////////////////////////////////////////////////////////////7
     
    public static int aleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1)) + minimo;
    }
      
    public static int aleatorioImpar(int minimo, int maximo) {
      int x;
        
    do {
      x = aleatorio(minimo, maximo);
      } while (x % 2 ==0);
          
      return x;
    }
} 
