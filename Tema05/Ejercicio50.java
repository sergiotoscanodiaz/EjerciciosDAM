public class Ejercicio50 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pinta el número 155. Por favor, introduzca la altura (5 como mínimo):");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println("Espacios entre los números (1 como mínimo):");
    int espacios = Integer.parseInt(System.console().readLine());
    
    //fila 1
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");

    //fila 2
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("*   ");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("*");

    //fila 3
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");

    //fila 4
    for (int fila = 0; fila < altura - 4; fila++) {
      System.out.print("*");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.print("   *");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.println("   *");
    }

    //fila 5
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");
    
    
  }
}
    
  
  
  
