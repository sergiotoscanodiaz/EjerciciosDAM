public class Ejercicio17 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que realiza un simulador de una pecera con un pez dentro: ");
    
    System.out.print("Por favor, introduzca la altura de la pecera: ");
    int alto = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduzca la anchura: ");
    int ancho = Integer.parseInt(System.console().readLine());

    for(int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();
    
    int pos = 0;

    int posPez = (int)(Math.random()*(alto - 2)*(ancho - 2));
    
    for(int i = 2; i < alto; i++) {
      System.out.print("*"); 
      for(int j = 2; j < ancho; j++) {
        if (pos == posPez) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        pos++;
      } 
      System.out.println("*"); 
    } 
    
    for(int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
  }
}
