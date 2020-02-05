import java.util.ArrayList;

public class Ejercicio01 {

  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();

    a.add("Rodrigo");
    a.add("Iván");
    a.add("Víctor");
    a.add("Miguel");
    a.add("Pedro");
    a.add("Pablo");

    System.out.println("Contenido de la lista: ");

    for(String nombre : a) {
      System.out.println(nombre);
    }
    
  }
  
}
