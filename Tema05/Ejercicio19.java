public class Ejercicio19 {

  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = altura-1;
    
    while (planta <= altura) {
           
      for (int i = 1; i <= espacios; i++) {
        System.out.println(" ");
      }
    
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(relleno);
      }

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}
