public class Ejercicio58 {

  public static void main(String[] args) {
   
    System.out.print("Introduzca un número entero: ");
    long numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int suma = 0;
    int longitud = 0;
    
    while (numeroIntroducido > 0) {
      suma += numeroIntroducido % 10;
      System.out.println(suma);
      numeroIntroducido /= 10;
      longitud++;
      System.out.println(longitud);
    }

    System.out.println("La media de sus dígitos es " + (double)suma / longitud);
  }
  
}

 
