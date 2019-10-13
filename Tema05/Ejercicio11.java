public class Ejercicio11 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número para que el programa muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%3d %5d %7d\n", i, i * i, i * i * i);
    }
  }
}
 
