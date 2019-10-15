public class Ejercicio23 {

  public static void main(String[] args) {
  
    System.out.println("Introduce tantos números hasta que la suma llegue al valor 10000 y verás la media entre todos ellos");
    
    int num;
	  int numeros = 0;    
    int suma = 0;
	
	  do{
        num = Integer.parseInt(System.console().readLine());
        suma =+ num;
        numeros ++;
	  } 
	    while (suma <=10000);
      
      System.out.println("Introduciste un total de " +numeros+ " numeros");
      System.out.println("El resultado de la suma es " + suma);
      System.out.println("La media es " +  suma / numeros);
	   	    
  }
}
