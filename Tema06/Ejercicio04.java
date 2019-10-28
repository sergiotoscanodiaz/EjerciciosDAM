public class Ejercicio04 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)");
         
      for (int i = 1; i <= 20; i++) {
        int numero = ((int)(Math.random()*10) + 1);    
        System.out.print(numero+" ");              
      }
  }
}
