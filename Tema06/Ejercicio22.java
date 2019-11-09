public class Ejercicio22 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la longitud de la serpiente: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    System.out.println("            @");
    
    int i;
    int posicionCabeza = 13;
        
    while (longitud > 1) {
      posicionCabeza += (int)(Math.random() * 3) - 1;
      

      for (i = 1; i < posicionCabeza; i++) {
        System.out.print(" ");
      }

      System.out.println("#");
      longitud--;
    }
  }
}
