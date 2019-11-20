public class BuscaTesoro {
  public static void main(String[] args) {
    
    System.out.println("¡Busca el tesoro!");
  
    int[][] mapa = new int[5][4];
    int x;
    int y;
    mapa[1][0] = 75;
    
    for(x = 0; x < 4; x++) {
      System.out.println();
      System.out.print(x + "|");
    }
    for(y = 0; y < 1; y++) {
      System.out.print("_____________");
    }    
    System.out.println();
    for(y = 0; y < 5; y++) {
      System.out.print("  "+ y);
    }
    
    

  }
}
