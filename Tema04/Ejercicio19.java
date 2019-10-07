public class Ejercicio19 {

  public static void main(String[] args) {
    
    int n, cifras = 0;
    
    System.out.print("Introduzca un número entero (de 5 cifras como máximo): ");
    n = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( n < 10 ) {
      cifras = 1;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      cifras = 2;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      cifras = 3;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      cifras = 4;
    }
    
    if ( n >= 10000 ) {
      cifras = 5;
    }
    
    System.out.println("El número introducido tiene " + cifras + " cifras.");
  }
}
