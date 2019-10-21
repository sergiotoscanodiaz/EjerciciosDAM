public class Ejercicio53 {

  public static void main(String[] args) {

    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(System.console().readLine());
    int espacios = 0;
    
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
           
    for (int j = 0; j < altura - i; j++) {
      System.out.print("*");
    
     System.out.println();
     espacios++;
     
    }
  }
     


