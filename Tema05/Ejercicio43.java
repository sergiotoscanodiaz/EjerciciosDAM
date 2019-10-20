public class Ejercicio43 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
    long posicion = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    

    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1));

    System.out.print("Los números partidos son el " + parteIzquierda + " y  el " + parteDerecha + ".");
  }
}
