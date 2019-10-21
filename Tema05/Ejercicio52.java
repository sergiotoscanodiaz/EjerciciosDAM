public class Ejercicio52 {

  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long cambio = numeroIntroducido;
    int longitud = 0;
    
    while (cambio > 0) {
      cambio /= 10;
      longitud++;
    }
    
    int primero =  (int)(numeroIntroducido / Math.pow(10, longitud - 1));
    long aux = (long)(primero * Math.pow(10, longitud - 1));
    long resultado = (numeroIntroducido - aux) * 10 + primero;
    System.out.println("El número resultado es " + resultado);
  }  
}
