public class Ejercicio13 {

  public static void main(String[] args) {

    System.out.println("Introduzca 10 números enteros: ");
    
    int positivos = 0;
    int negativos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    
    System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
  }
}
