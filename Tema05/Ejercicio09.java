public class Ejercicio09 {

  public static void main(String[] args) {
   
    int numeroDeDigitos = 1, n, num;

    System.out.print("Introduzca un número entero y verás cuántos dígitos tiene: ");
    num = Integer.parseInt(System.console().readLine());
    
    n = num;
    
    while (n >= 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(num + " tiene " + numeroDeDigitos + " cifras.");

  }
}
