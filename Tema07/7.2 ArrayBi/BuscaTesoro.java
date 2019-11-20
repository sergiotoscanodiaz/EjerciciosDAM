public class BuscaTesoro {
  public static void main(String[] args) {
    
    System.out.println("¡Busca el tesoro!");
  
    int[][] mapa = new int[5][4];
    int x;
    int y;
        
    for(x = 3; x > -1; x--) {
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
    
    System.out.println(" ");
    System.out.println("Escriba las coordenadas para buscar el tesoro.");
    System.out.print("Coordenada x: ");
    x = Integer.parseInt(System.console().readLine());
    System.out.print("Coordenada y: ");
    y = Integer.parseInt(System.console().readLine());

    

  }
}
