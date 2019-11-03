public class Ejercicio12 {

  public static void main(String[] args) {

  System.out.print("\033[32m"); // pinta en verde
    
    for(int i = 0; i < 8000; i++) {
      System.out.print((char)(Math.random() * 10000));
    }
  }
}
