public class Ejercicio27 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número mayor que el número 1: ");
   
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int contador = 0;
    int suma = 0;
  
    System.out.println("Los múltiplos son: " );
    
     for (int n = 1; n < numeroIntroducido; n++) {
      if ((n % 3) == 0) {
        
        System.out.println(n + " ");
        contador++;
        suma += n;
      }
    }
          System.out.print("Desde 1 hasta " + numeroIntroducido + " hay " + contador);
          System.out.println(" múltiplos de 3 y suman " + suma);  
          
  }
}

