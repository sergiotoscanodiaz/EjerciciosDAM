package Ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

      for (int i = 1; i < 501; i++) {
        if (esPrimo(i)) {
          bw.write(i + "\n");
        }
      }
      bw.close();
      System.out.println("Los primos se ha creado satisfactoriamente en primos.dat");
    } catch (IOException ioe) {
        System.out.println("Se ha producido al intentar grabar los primos en primos.dat");
        System.out.println("Error del sistema" + ioe);
    }
  }
  
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }
}
