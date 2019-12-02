import java.util.Scanner;

public class Ejercicio20 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el número total de nombres de reyes: ");
    int numeroTotalReyes = Integer.parseInt(s.nextLine());

    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO: ");
    
    String[] nombreDeReyes = new String[numeroTotalReyes];
    
    for(int i = 0; i < numeroTotalReyes; i++) {
      nombreDeReyes[i] = s.nextLine();          
    }
    
    for(int i = 0; i < numeroTotalReyes; i++) {
      int numeroDeRey = 1;
      String nombreActual = nombreDeReyes [i];
      
      for(int j = 0; j < i; j++) {
        if (nombreActual.equals(nombreDeReyes[j])) {
          numeroDeRey++;
        }
      }
      
      System.out.println(nombreActual + " " + numeroDeRey + " º");         
    }
 
  }

}
