import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    System.out.println("Introduzca 10 palabras: ");
    
    for (int i = 0; i < 10; i++) {
      a.add(System.console().readLine());
    }

    System.out.println("Lista original: " + a);

    Collections.sort(a);

    System.out.println("Lista ordenada alfabéticamente: " + a);

  }
}
