public class Ejercicio07 {

  public static void main(String[] args) {
    
    int[] numero = new int[100];
    int i;

    for (i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random() * 21);
      System.out.print(numero[i] + "  ");
    }
  }
}
