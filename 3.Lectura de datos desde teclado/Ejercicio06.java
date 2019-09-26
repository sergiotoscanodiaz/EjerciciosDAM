public class Ejercicio06 {
  public static void main(String[] args) {
    String linea;
	
	System.out.print("Por favor, introduce un número para la base: ");
	linea = System.console().readLine();
	int base;	
	base = Integer.parseInt( linea );
	System.out.print("Por favor, introduce un segundo número para la altura: ");
	linea = System.console().readLine();
	int altura;
	altura = Integer.parseInt( linea );
	
	int ÁreaTriángulo;
	ÁreaTriángulo = ( (base * altura)/2 );
	System.out.println("El área del triángulo es: " +ÁreaTriángulo);
	}
}
