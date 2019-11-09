public class Ejercicio24 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);

    int posicion = (int)(Math.random() * longitud);

    System.out.println((numeroIntroducido / (long)(Math.pow(10, longitud - posicion))) % 10);
  }
}
