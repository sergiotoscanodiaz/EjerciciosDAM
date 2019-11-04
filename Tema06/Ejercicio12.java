public class Ejercicio12 {

  public static void main(String[] args) {

  System.out.print("\033[32m");
    for(long i = 0; i < 1000000000; i++) {
      int num = ((int)(Math.random() * 95)+32);
      System.out.print((char)(num));
    }
  }
}
