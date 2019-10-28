public class Ejercicio06 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)");
    
    int suma = 0;
    int min = 199;
    int max = 100;
    int numero;
    
      for (int i = 1; i <= 50; i++) {
        numero = ((int)(Math.random()*100) + 100);    
        System.out.print(numero+" ");             
        suma += numero; 
        
         if (numero < min) {
           min = numero;
         }
      
         if (numero > max) {
           max = numero;
         }
      }
      System.out.println();
      
      System.out.println("Media: " +suma/50);
      System.out.println("El máximo es: " +max);
      System.out.println("El mínimo es: " +min);
  }
}
