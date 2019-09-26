public class Ejercicio01 {
  public static void main(String[] args) {
    String linea;
	System.out.print("Por favor, introduce un número: ");
	linea = System.console().readLine();
	int Numero1;
	Numero1 = Integer.parseInt( linea );
	System.out.print("introduce otro, por favor: ");
	linea = System.console().readLine();
	int Numero2;
	Numero2 = Integer.parseInt( linea );
	int total;
	total = (Numero1 * Numero2);
	System.out.print("El primer número introducido es " + Numero1);
	System.out.println(" y el segundo es " + Numero2);
	System.out.print("El resultado de la multiplicación entre Numero1 y Numero 2 es: ");
	System.out.print(total);
	}
}
