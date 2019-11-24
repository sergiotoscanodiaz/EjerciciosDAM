public class Ejercicio04 {
  public static void main(String[] args) throws InterruptedException {

    int[][] num = new int[4][5]; 
    
    int fila;
    int columna;
    

    System.out.println("Por favor, introduzca los números (enteros) en el array");
    for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        num[fila][columna] = (int)(Math.random() * 900) + 100;
      }
    }

    int sumaFila;
    for(fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
         Thread.sleep(150);
      }
      System.out.printf("|%7d\n", sumaFila);
       Thread.sleep(400);
    }
 
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumaColumna;
    int sumaTotal = 0;
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }

      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
      Thread.sleep(400);
    }
    System.out.printf("|%7d   ", sumaTotal);
  }
}
