public class Ejercicio51 {
  
  public static void main(String[] args) {

    System.out.print("El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que encuentre). Introduzca un número entero (mayor que cero): ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroIntroducido;
    int reves = 0;
    boolean numeroComido = false;

    while (numero > 0) {
      if ((numero % 10 != 0) && (numero % 10 != 8)) {
        reves = (reves * 10) + (numero % 10);
      } else {
        numeroComido = true;
      }
      numero /= 10;
    }

    numero = reves;
    reves = 0;

    while (numero > 0) {
      reves = (reves * 10) + (numero % 10);
      numero /= 10;
    }

    if (numeroComido) {
      System.out.print("Después de haber sido comido por el gusano numérico");
      System.out.println(" se queda en " + reves);
    } else {
      System.out.println("El gusano numérico no se ha comido ningún dígito.");
    }
  }
}
