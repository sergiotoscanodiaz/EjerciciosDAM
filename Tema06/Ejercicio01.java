public class Ejercicio01 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que muestra la tirada de tres dados: ");
      
      int suma = 0;  
         
        for (int i = 1; i <= 3; i++) {
          int numero = ((int)(Math.random()*6) + 1);    
          System.out.println(numero);
          suma+=numero;         
        }
        
        System.out.print("Suma de los resultados: " +suma);
  }
}
