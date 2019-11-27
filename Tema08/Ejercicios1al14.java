import matematicas.VariasFunciones;

public class Ejercicios1al14 {

  public static void main(String[] args) {

    //1.esCapicua 
    if (matematicas.VariasFunciones.esCapicua(323)) {
      System.out.println("El 323 es capicúa");
    }
    
    //2.esPrimo    
    if (matematicas.VariasFunciones.esPrimo(7)) {
      System.out.println("El 7 es primo");
    }

    //3.siguientePrimo
    System.out.println("El siguiente primo mayor a 13 es " + matematicas.VariasFunciones.siguientePrimo(13));
    
    //4.potencia
    System.out.println("2^-10 = " + matematicas.VariasFunciones.potencia(2, -10));
    
    //5.digitos
    System.out.println("El número 999999 tiene " + matematicas.VariasFunciones.digitos(999999) + " dígito/s.");
    
    //6.voltea
     System.out.println("El 56 volteado es " + matematicas.VariasFunciones.voltea(56));
    
    //7.digitoN
     System.out.println("En la posición 4 del 3452 está el " + matematicas.VariasFunciones.digitoN(3452, 4));
  }
}
