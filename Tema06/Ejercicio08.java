public class Ejercicio08 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que muestra tres apuestas de la quiniela: ");
     
    int quiniela;
    int columnas = 3;
    
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf(" |", fila);
      
      if (fila == 15) {
        columnas = 1;
      }
      
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        quiniela = (int)(Math.random() * 6) + 1;
        int uno = ((int)(Math.random()*3) + 1);
        int dos = ((int)(Math.random()*2) + 1);
        int emp = ((int)(Math.random()*1) + 1);
        switch(quiniela) {
          case 1:            
            System.out.print("1  |");
            break;
          case 2:            
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
          default:
        }
      }
      System.out.println();
    }
  }
}
