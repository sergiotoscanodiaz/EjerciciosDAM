public class Ejercicio03 {
  public static void main(String[] args) {
  
    String linea;
	    System.out.print("Por favor, introduce un número: ");
	    linea = System.console().readLine();
	 
    int numero1;
	    numero1 = Integer.parseInt( linea );
	
    int total;
	    total = (numero1/166);
      System.out.printf(numero1+" pesetas son " + total + " euros ");
  
	}
}
