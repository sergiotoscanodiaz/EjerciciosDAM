public class Ejercicio05 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)");
    
    int suma = 0;
    int min = 0;
    int max = 0;
    int aux = 0;
         
      for (int i = 1; i <= 50; i++) {
        int numero = ((int)(Math.random()*100) + 100);    
        System.out.print(numero+" ");             
        suma += numero; 
        
      }
      System.out.println();
      
      System.out.print("Media: " +suma/50);
      
  }
}
