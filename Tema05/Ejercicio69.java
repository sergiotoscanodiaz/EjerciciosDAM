import java.util.Scanner;

public class Ejercicio69 {

  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Introduzca la altura de la Pirámide: ");	
	int altura = Integer.parseInt(s.nextLine());  
	
	int caracteresPorFila = 1;
	int espaciosDelanteros = altura;
		     
    for (int i = 0; i < altura; i++) {
	  //Pinta los espacios delanteros en cada fila
	  for (int j = 0; j < espaciosDelanteros; j++) {
	    System.out.print(" ");
	  }
			
	  //Pinta el flanco izquierdo 
	  for (int j = 0; j < caracteresPorFila; j++) {
	    System.out.print("*");
	  }
    
    //Pinta la parte central
    if (i%2 ==0) { //cuando i es par
       System.out.print("****");
    } else {
     System.out.print("    ");
    }
    
    //Pinta el flanco derecho 
	  for (int j = 0; j < caracteresPorFila; j++) {
	    System.out.print("*");
	  }
        
	  System.out.println();
	  
	  caracteresPorFila ++;
	  espaciosDelanteros--;
	  
	}
		 
  }
  
}
