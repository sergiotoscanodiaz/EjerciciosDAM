public class Ejercicio17{

  public static void main(String[] args) {
            
    System.out.print("Este programa suma los 100 números siguientes a un número entero positivo introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un número positivo). Introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());    
    
    int suma = 0;
    
    for(int i = numero; i < numero + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 números siguientes a " + numero + " es " + suma);
  }
}
