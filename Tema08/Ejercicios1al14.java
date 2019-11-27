import matematicas.VariasFunciones;

public class Ejercicios1al14 {

  public static void main(String[] args) {

    // esCapicua 

    if (matematicas.VariasFunciones.esCapicua(7)) {
      System.out.println("El 7 es capicúa");
    }

    if (matematicas.VariasFunciones.esCapicua(464)) {
      System.out.println("El 464 es capicúa");
    }
    
    //esPrimo
    
    if (matematicas.VariasFunciones.esPrimo(7)) {
      System.out.println("El 7 es primo");
    }

    if (matematicas.VariasFunciones.esPrimo(80)) {
      System.out.println("El 80 es primo");
    }
    
    //siguientePrimo
    
    System.out.println("El siguiente primo mayor a 7 es " + matematicas.VariasFunciones.siguientePrimo(7));
    System.out.println("El siguiente primo mayor a 150 es " + matematicas.VariasFunciones.siguientePrimo(50));
  }
}
