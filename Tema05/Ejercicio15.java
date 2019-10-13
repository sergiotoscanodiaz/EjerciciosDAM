public class Ejercicio15 {

  public static void main(String[] args) {

     
    System.out.print("En este programa verás por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Introduzca un número real como base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca un múmero entero como exponente: ");
    int exponenteA = Integer.parseInt(System.console().readLine());
        
    for (int i = 1; i <= exponenteA; i++) {
        
      double potencia = 1;
      int exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}
