public class Ejercicio17 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número es el " + (num % 10));
  }
}
