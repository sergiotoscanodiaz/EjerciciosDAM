public class Ejercicio49 {
  public static void main(String[] args) {
    
    System.out.println("Introduce números enteros positivos. ");
    System.out.println("Introduzca un número primo para que el programa pare:");

    int numero;
    int suma = 0;
    int contador = 0;
    int maximo;
    int minimo;
    boolean esPrimo;

    do {
      numero = Integer.parseInt(System.console().readLine());

      esPrimo = true;
      for (int i = 2; i < numero; i++) {
        if ((numero % i) == 0) {
          esPrimo = false;
        }
      }

      if (!esPrimo) {
        suma += numero;
        contador++;
        
        maximo = numero > maximo ? numero : maximo;
        minimo = numero < minimo ? numero : minimo;
      }
      
    } while (!esPrimo);
    
    System.out.println("Ha introducido " + contador + " números no primos.");
    System.out.println("Máximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + (double)suma / contador);


  }
}

