package matematicas;

public class VariasFunciones {

  //1.esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario. 
  public static boolean esCapicua(long n) {
    return n == voltea(n);
  }

  public static boolean esCapicua(int n) {
    return esCapicua((long)n);
  }
  
  //2.esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.  
  public static boolean esPrimo(long n) {
    if (n < 2) {
      return false;
    } else {
      for (long i = n / 2; i >= 2; i--) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean esPrimo(int n) {
    return esPrimo((long) n);
  }
  
  //3.siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.  
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {};

    return x;
  }
  
  //6.Voltea: Le da la vuelta a un número.  
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }

    long volteado = 0;

    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }
  
    public static int voltea(int x) {
    return (int)voltea((long)x);
  }
  
}
