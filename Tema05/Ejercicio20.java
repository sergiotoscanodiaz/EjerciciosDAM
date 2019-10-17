import java.util.Scanner;

public class Ejercicio20 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Introduzca la altura de la Pirámide: ");	
	int altura = Integer.parseInt(s.nextLine());  
	
	System.out.println("Introduzca el caracter con el que quiere pintar la Pirámide: ");	
	String caracter = s.nextLine(); 
	
	int caracteresPorFila = 1;
	int espaciosDelanteros = altura;
		     
    for (int i = 0; i < altura; i++) {
	  //Pinta los espacios delanteros en cada fila
	  for (int j = 0; j < espaciosDelanteros; j++) {
	    System.out.print(" ");
	  }
			
	  //Pinta los caracteres de la fila
	  for (int j = 0; j < caracteresPorFila; j++) {
	    System.out.print(caracter);
	  }
	  System.out.println();
	  
	  caracteresPorFila += 2;
	  espaciosDelanteros--;
	  
	}
		 
  }
  
}
