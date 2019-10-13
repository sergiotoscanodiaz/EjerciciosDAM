public class Ejercicio18 {

  public static void main(String[] args) {
    
    int primerNumero;
    int segundoNumero;
    
    do {
      System.out.print("Introduzca un número entero: ");
      primerNumero = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca otro número entero distinto al anterior: ");
      segundoNumero = Integer.parseInt(System.console().readLine());
      
      if(primerNumero == segundoNumero) {
        System.out.println("Los números introducidos son idénticos, deben ser distintos, ¡por favor!");
      }
    } while (primerNumero == segundoNumero);
    
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }       
  }
}
