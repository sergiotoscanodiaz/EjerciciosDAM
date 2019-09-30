public class Ejercicio09 {
  public static void main(String[] args) {
    String linea;
	
	System.out.print("Por favor, introduce un número para el radio del cono: ");
	linea = System.console().readLine();
	int r;	
	r = Integer.parseInt( linea );
	System.out.print("Por favor, introduce un segundo número para la altura: ");
	linea = System.console().readLine();
	int h;
	h = Integer.parseInt( linea );
	
	double VolumenCono;
	double π = 3.14;
	VolumenCono = (π*(r*r)*h)/3;
	System.out.println("El volumen del cono es: " +VolumenCono+ "cm3");
	}
}
