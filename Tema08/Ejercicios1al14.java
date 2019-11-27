import matematicas.VariasFunciones;

public class Ejercicios1al14 {

  public static void main(String[] args) {

    // esCapicua 
    if (matematicas.VariasFunciones.esCapicua(323)) {
      System.out.println("El 323 es capicúa");
    }
    
    //esPrimo    
    if (matematicas.VariasFunciones.esPrimo(7)) {
      System.out.println("El 7 es primo");
    }

    //siguientePrimo
    System.out.println("El siguiente primo mayor a 13 es " + matematicas.VariasFunciones.siguientePrimo(13));

  }
}
