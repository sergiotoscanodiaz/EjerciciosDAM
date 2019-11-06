public class Ejercicio20 {
  public static void main(String[] args) {

    System.out.println("Este es un programa que pinta por pantalla una cuba con cierta cantidad de agua.");
    System.out.println("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = Integer.parseInt(System.console().readLine());

    int litros = (int)(Math.random() * (capacidad + 1));
        
    for (int i = 0; i < capacidad; i++) {
      if (i < (capacidad - litros)) {
        System.out.println("*    *");
      } else {
        System.out.println("*xxxx*");
      }
    }
        
    System.out.println("******"); 
    System.out.print("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + litros + " litros de agua.");
    
  }
}

