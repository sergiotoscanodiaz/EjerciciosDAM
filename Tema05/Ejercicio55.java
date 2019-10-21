public class Ejercicio55 {

  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long cambio = numeroIntroducido;
    int longitud = 0;
    
    while (cambio > 0) {
      cambio /= 10;
      longitud++;
    }
    
    int ultimo = (int) (numeroIntroducido % 10);
    long aux = numeroIntroducido / 10;
    long resultado = ultimo * (long) Math.pow(10, longitud - 1) + aux;
    System.out.println("El número resultado es " + resultado);
    
  }  
}

