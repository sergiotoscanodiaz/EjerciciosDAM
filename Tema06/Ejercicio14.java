public class Ejercicio14 {

  public static void main(String[] args) {
    
    int oportunidades = 5;
    int numeroPensado;
    int min = 0;
    int max = 100;
    boolean acertado = false;
        
    System.out.println("Piensa un número del 0 al 100");

    do {
      numeroPensado = (int)(Math.random() * (max - min) + min);
      System.out.println("¿Es el " + numeroPensado + "?");
      System.out.print("El número que estás pensando es M) mayor m) menor i) igual: ");
      String respuesta = System.console().readLine();
      oportunidades--;

      if ( (respuesta.equals("M")) && (oportunidades > 0) )
        min = numeroPensado + 1;
      
      if ( (respuesta.equals("m")) && (oportunidades > 0) )
        max = numeroPensado - 1;
      
      if (respuesta.equals("i")) {
        acertado = true;
        System.out.println("¡Perfecto! ¡Qué feliz estoy!");
      }
    } while(!acertado && (oportunidades > 0));
    
    if (!acertado) {
      System.out.println("¡Piensa en un número más fácil la próxima vez!");
    }
  }
}

