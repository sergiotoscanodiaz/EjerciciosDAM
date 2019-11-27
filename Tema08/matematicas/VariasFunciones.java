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
  
  //4.potencia: Dada una base y un exponente devuelve la potencia.
  public static double potencia(int base, int exponente) {
    if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }

    int n = 1;

    for (int i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }

    return n;
  }
  
  //5.digitos: Cuenta el número de dígitos de un número entero.
  public static int digitos(long x) {
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10; 
        n++; 
      }
      return n;
    }
  }

  public static int digitos(int x) {
    return digitos((long)x);
  }

  //6.voltea: Le da la vuelta a un número.  
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
  
  //7. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha
  public static int digitoN(long x, int n) {
    x = voltea(x);

    while (n-- > 1) {
      x = x / 10;
    }

    return (int)x % 10;
  }

  public static int digitoN(int x, int n) {
    return digitoN((long)x, n);
  
  //8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
  
  }
}
