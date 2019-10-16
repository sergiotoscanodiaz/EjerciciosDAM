public class Ejercicio28 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número y le mostraré su factorial: ");
   
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int factorial = numeroIntroducido; 
    
    if(numeroIntroducido == 0){
      System.out.print("El factorial de " +numeroIntroducido+" es 1");
    } else {
      for (int n = 1; n < numeroIntroducido; n++) {
        factorial *= n;
    }
    
      System.out.println(numeroIntroducido + "! = " + factorial);
      
    }
  }       
}

