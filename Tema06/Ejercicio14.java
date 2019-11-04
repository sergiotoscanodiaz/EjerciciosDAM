public class Ejercicio14 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que piensa un número al azar entre 0 y 100. Introduzca un número: ");
    
    String respuesta;
    
    for (int i=1; i<=5; i++){
    int numero = ((int)(Math.random()*100)+1);
    System.out.println("¿Es este el número que has pensado? s/n " +numero);
    respuesta = System.console().readLine();
    
      if(respuesta.equals("s")){
        System.out.println("¡Eres un máquina!");
      }
    }
  }    
}

