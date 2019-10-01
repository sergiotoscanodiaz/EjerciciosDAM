public class Ejercicio03 {
  public static void main(String[] args) {
    String linea;
	System.out.print("Por favor, introduce un número: ");
	linea = System.console().readLine();
	int Numero1;
	Numero1 = Integer.parseInt( linea );
	int total;
	total = (Numero1/166);
	System.out.printf(Numero1+" pesetas son " + total + " euros ");
	}
}
