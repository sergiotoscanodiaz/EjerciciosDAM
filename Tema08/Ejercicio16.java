import matematicas.VariasFunciones;

public class Ejercicio16 {

  public static void main(String[] args) {
    
    for(int i = 1; i < 100000; i++) {
      if (matematicas.VariasFunciones.esCapicua(i)) {
        System.out.print(i + "  ");
      }
    }    
  }
}
