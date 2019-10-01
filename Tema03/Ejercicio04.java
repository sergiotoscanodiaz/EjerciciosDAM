public class Ejercicio04 {
  public static void main(String[] args) {
    String linea;
	
	System.out.print("Por favor, introduce un número: ");
	linea = System.console().readLine();
	int Numero1;	
	Numero1 = Integer.parseInt( linea );
	System.out.print("Por favor, introduce un segundo número: ");
	linea = System.console().readLine();
	int Numero2;
	Numero2 = Integer.parseInt( linea );
	
	int suma;
	suma = (Numero1 + Numero2);
	System.out.println("Resultado de la suma: " +suma);
	int resta;
	resta = (Numero1 - Numero2);
	System.out.println("Resultado de la resta: " +resta);
	int multiplicación;
	multiplicación = (Numero1 * Numero2);
	System.out.println("Resultado de la multiplicación: " +multiplicación);
	int división;
	división = (Numero1 / Numero2);
	System.out.println("Resultado de la división: " +división);
	}
}
