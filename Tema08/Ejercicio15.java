import matematicas.VariasFunciones;

public class Ejercicio15 {

  public static void main(String[] args) {
    
    for(int i = 1; i < 1001; i++) {
      if (matematicas.VariasFunciones.esPrimo(i)) {
        System.out.print(i + "  ");
      }
    }    
  }
}
