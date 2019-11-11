/*Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente. */

public class Ejercicio05 {

  public static void main(String[] args) {
    
    System.out.println("Teclea 10 números por teclado pulsando ENTER: ");
    int[] n = new int[10];
    
    for (int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
      
  }
}
