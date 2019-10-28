public class Ejercicio06 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que piensa un número al azar entre 0 y 100. Introduzca un número: ");
    
    String numeroIntroducido;
    int numero = ((int)(Math.random()*101));
    
      for (int i = 1; i <= 5; i++) {
        numeroIntroducido = System.console().readLine();
        int n = Integer.parseInt(numeroIntroducido);  
        
        if (n == numero){
          System.out.println("¡Has acertado!");
        }else{
          System.out.println("¡Inténtalo otra vez!");                
        }
      } 
  }
}
