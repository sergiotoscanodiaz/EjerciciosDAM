public class Ejercicio26 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número : ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(System.console().readLine());

    System.out.print("El digito " + digito + " aparece dentro de " + numeroIntroducido + " en estas posiciones: ");
    
    int numero = numeroIntroducido;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    } 

    System.out.println();
  }
}

