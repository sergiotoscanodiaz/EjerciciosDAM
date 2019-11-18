public class Ejercicio03 {

public static void main(String[] args) {
    
    int[] n = new int[10];
    
    System.out.println("Por favor, introduzca 10 números enteros.");

    for (int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Los números introducidos, en el orden inverso, son los siguientes:");
    for (int i = 9; i >= 0; i--) {
      System.out.println(n[i]);
    }
  }
}
