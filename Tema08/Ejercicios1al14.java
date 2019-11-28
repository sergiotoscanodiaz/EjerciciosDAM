import matematicas.VariasFunciones;

public class Ejercicios1al14 {

  public static void main(String[] args) {

    //1.esCapicua 
    if (matematicas.VariasFunciones.esCapicua(323)) {
      System.out.println("El 323 es capicúa.");
    }
    
    //2.esPrimo    
    if (matematicas.VariasFunciones.esPrimo(7)) {
      System.out.println("El 7 es primo.");
    }

    //3.siguientePrimo
    System.out.println("El siguiente primo mayor a 13 es " + matematicas.VariasFunciones.siguientePrimo(13)+ ".");
    
    //4.potencia
    System.out.println("2^-10 = " + matematicas.VariasFunciones.potencia(2, -10)+ ".");
    
    //5.digitos
    System.out.println("El número 9999 tiene " + matematicas.VariasFunciones.digitos(9999) + " dígito/s.");
    
    //6.voltea
     System.out.println("El 56 volteado es " + matematicas.VariasFunciones.voltea(56)+ ".");
    
    //7.digitoN
     System.out.println("En la posición 2 del 3452 está el " + matematicas.VariasFunciones.digitoN(3452, 2)+ ".");
     
    //8.posicionDeDigito
    System.out.println("En el 78604321, el dígito 3 está en la posición " + matematicas.VariasFunciones.posicionDigito(78604321, 3)+ ".");
     
    //9.quitaPorDetras 
    System.out.println("Si al 78604321 se le quitan por detrás 7 dígitos, se queda como " + matematicas.VariasFunciones.quitaPorDetras(78604321, 7) + ".");
    
    //10.quitaPorDelante
    System.out.println("Si al 78604321 se le quitan por delante 5 dígitos, se queda como " + matematicas.VariasFunciones.quitaPorDelante(78604321, 5) + ".");
    
     //11.pegaPorDetras
    System.out.println("Si al 345 se le pega por detrás el 1 da el " + matematicas.VariasFunciones.pegaPorDetras(345, 1));

    //12.pegaPorDelante
    System.out.println("Si al 678 se le pega por delate el 1 da el " + matematicas.VariasFunciones.pegaPorDelante(678, 1));

    //13.trozoDeNumero
    System.out.println("Al 123456 le cojo el trozo que va de la posición 0 a la 3: " + matematicas.VariasFunciones.trozoDeNumero(123456, 0, 3));

    //14.juntaNumeros
    System.out.println("Juntando el 56 y el 80 da el " + matematicas.VariasFunciones.juntaNumeros(56, 80));

  }
}
