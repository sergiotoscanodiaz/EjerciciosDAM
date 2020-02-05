package ex18std;

import java.util.HashMap;
import java.util.Scanner;

public class Ex18std1 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    HashMap<String, String> capitales = new HashMap<>();

    capitales.put("Espana", "Madrid"); //Al poner España el IDE no reconoce la 'ñ'. Espana sí es válido.
    capitales.put("Portugal", "Lisboa");
    capitales.put("Francia", "París");

    String paisIntroducido = "";

    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");
      paisIntroducido = s.nextLine();

      if (!paisIntroducido.equals("salir")) { 
        if (capitales.containsKey(paisIntroducido)) { //Si el país introducido existe te muestra su capital
          System.out.print("La capital de " + paisIntroducido);
          System.out.println(" es " + capitales.get(paisIntroducido));
        } else {
          System.out.print("No conozco la respuesta, ¿cuál es la capital de " + paisIntroducido + "?: "); //Si no existe el país introducido, teclea su capital
          String capital = s.nextLine();
          capitales.put(paisIntroducido, capital);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!paisIntroducido.equals("salir")); //para salir del programa introduce "salir"

  }

}
