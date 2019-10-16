public class Ejercicio29 {

  public static void main(String[] args) {
   
   System.out.print("Introduzca un número entero positivo grande: ");
    int numeroGrande = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca otro número que sea pequeño: ");
    int numeroPequeno = Integer.parseInt(System.console().readLine());

    System.out.print("Los números enteros positivos menores que " + numeroGrande );
    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");

    for (int n = 1; n < numeroGrande; n++) {
      if ((n % numeroPequeno) != 0) {
        System.out.print(n + " ");
        
      }
    }      
  }       
}
