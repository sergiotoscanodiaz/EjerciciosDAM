public class Ejercicio07 {

  public static void main(String[] args) {
	
	System.out.println("Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá la combinación para abrirla.");
	System.out.println("Por favor, introduzca la combinación. Recuerda que debe ser un número de cuatro cifras: ");
	int oportunidades = 4;
		
	  do{
		
		int i = Integer.parseInt(System.console().readLine());
       
          if(i == 2407){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
       
          } else {
		    System.out.println("Lo siento, esa no es la combinación. ¡Prueba otra vez!");
          }
          oportunidades --;
	    } 
	     while ((oportunidades > 0) && (oportunidades < 4));	  	    		  
    }  	    
  }      
    
