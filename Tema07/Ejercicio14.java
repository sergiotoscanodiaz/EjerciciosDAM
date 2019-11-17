public class Ejercicio14 {
  public static void main(String[] args) {

    String[] color = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
    };

    String[] palabra = new String[8];
    String[] resultado = new String[8];

    System.out.println("Introduzca 8 palabras: ");
    
    int j = 0;
    
    for (int i = 0; i < 8; i++) {
      palabra[i] = System.console().readLine();

      for (String c : color) {
        if (palabra[i].equals(c)) {
          resultado[j++] = c;
        }
      }
    }

    for (int i = 0; i < 8; i++) {
      boolean esColor = false;

      for (String c : color) {
        if (palabra[i].equals(c)) {
          esColor = true;
        }
      }

      if (!esColor) {
        resultado[j++] = palabra[i];
      }
    }

    System.out.println("Array original:");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│  %d  ", i);
    }
    System.out.println();

    for (String p : palabra) {
      System.out.printf("│%-2s", p);
    }
    System.out.println();

    System.out.println("Array resultado:");
    System.out.println();
    for (int i = 0; i < 8; i++) {
      System.out.printf("│ %d  ", i);
    }
    System.out.println();

    for (String r : resultado) {
      System.out.printf("│%-2s", r);
    }
    System.out.println();
  }
}
