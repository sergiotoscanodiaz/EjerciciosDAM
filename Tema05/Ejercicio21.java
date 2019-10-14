public class Ejercicio21 {

  public static void main(String[] args) {
  
    int numeros = 0;
    int numeroIntroducido = 0;
    int sum = 0;

    System.out.println("Este programa calcula la media de los números positivos introducidos.");
    System.out.println("El programa para introduciendo un número negativo):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      sum += numeroIntroducido;
    }
    
    System.out.println("La media de los números positivos introducidos es " + (sum - numeroIntroducido)/ (numeros - 1));
  
  }
}
