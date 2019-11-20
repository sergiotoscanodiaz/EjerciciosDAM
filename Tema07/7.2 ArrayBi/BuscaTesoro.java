/*Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de cuatro filas por cinco columnas. 
 * El usuario intentará averiguar dónde está el tesoro.*/

public class BuscaTesoro {
  public static void main(String[] args) {
    
    System.out.println("¡Busca el tesoro!");
  
    //Variables
    int[][] mapa = new int[5][4];
    int x;
    int y;
    
    //Coloca el tesoro    
    int tesoroX = (int)(Math.random() * 5);
    int tesoroY = (int)(Math.random() * 4);
    
    //Pinta el mapa que contiene un tesoro
    System.out.print("Y");
    for(y = 3; y > -1; y--) {
      System.out.println();
      System.out.print(y + "|");      
    }
    for(x = 0; x < 1; x++) {
      System.out.print("_____________");
    }    
    System.out.println();
    for(x = 0; x < 5; x++) {
      System.out.print("  "+ x);
    }
    System.out.print(" X");
    
    //Pide las coordenadas
    System.out.println();
    System.out.println("Escriba las coordenadas para buscar el tesoro.");
    System.out.print("Coordenada x: ");
    x = Integer.parseInt(System.console().readLine());
    System.out.print("Coordenada y: ");
    y = Integer.parseInt(System.console().readLine());

  }
}
