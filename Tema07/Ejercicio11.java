public class Ejercicio11 {
  public static void main(String[] args) {
  
    int[] n = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i;
    int j;
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    
    System.out.println("Introduzca 10 números separados por INTRO:");

    for (i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());

      esPrimo = true;
      for (j = 2; j < n[i] - 1; j++) {
        if (n[i] % j == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) {
        primo[primos++] = n[i];
      } else {
        noPrimo[noPrimos++] = n[i];
      }
    }
    
    System.out.println("Array original: ");
    System.out.println("Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%1d ", i);
    }
    
    System.out.println();
 
    System.out.println("Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%1d ", n[i]);
    }
    
    for (i = 0; i < primos; i++) {
      n[i] = primo[i];
    }
    
    for (i = primos; i < primos + noPrimos; i++) {
      n[i] = noPrimo[i - primos];
    }

    System.out.println("\n\nArray con los primos al principio:");
    System.out.println("Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%1d ", i);
    }
    
    System.out.println();
    
    System.out.println("Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%1d ", n[i]);
    }
      System.out.println();
  }
}
