import java.util.HashMap;

public class Ejercicio10 {
  public static void main(String[] args) {

    HashMap<String, String> m = new HashMap<String, String>();

    m.put("ordenador", "computer");
    m.put("gato", "cat");
    m.put("rojo", "red");
    m.put("árbol", "tree");
    m.put("pingüino", "penguin");
    m.put("sol", "sun");
    m.put("agua", "water");
    m.put("viento", "wind");
    m.put("siesta", "siesta");
    m.put("arriba", "up");
    m.put("ratón", "mouse");
    m.put("estadio", "arena");
    m.put("calumnia", "aspersion");
    m.put("aguacate", "avocado");
    m.put("cuerpo", "body");
    m.put("concurso", "contest");
    m.put("cena", "dinner");
    m.put("salida", "exit");
    m.put("lenteja", "lentil");
    m.put("cacerola", "pan");
    m.put("pastel", "pie");
    m.put("membrillo", "quince");

    System.out.print("Introduzca una palabra en español: ");
    String palabra = System.console().readLine();

    if (m.containsKey(palabra)) {
      System.out.println(palabra + " en inglés es " + m.get(palabra));
    } else {
      System.out.print("Lo siento, no conozco esa palabra.");
    }
  }
}
