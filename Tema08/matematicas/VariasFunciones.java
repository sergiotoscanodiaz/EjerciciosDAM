package matematicas;

public class VariasFunciones {

  /*// esCapicua 
 
  public static boolean esCapicua(int n) {
    return n == voltea(n);
  }

  public static boolean esCapicua(int n) {
    return esCapicua((int)n);
  }*/
  
  //esPrimo
  
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
  
}
