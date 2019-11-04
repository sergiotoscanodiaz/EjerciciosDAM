public class Ejercicio14 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que piensa un número al azar entre 0 y 100. Introduzca un número: ");
    
    String numeroIntroducido;
    int numero = ((int)(Math.random()*101));
    System.out.println("¿Es este el número que has pensado? s/n " +numero);
    String respuesta = System.console().readLine();
    
    if (respuesta.equals("s"));
      System.out.println("¡Perfecto!");
    
       
  }
}
