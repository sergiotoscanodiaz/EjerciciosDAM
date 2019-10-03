public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.print("Este programa calcula la media de tres notas. Por favor, introduzca la primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2 + nota3)/3 ;
    
    System.out.println("Tu nota media es = " + media);
	
	if ((media >= 0) && (media <= 4)) {
      System.out.println("Insuficiente");
    }       
    if (media == 5) {
      System.out.println("Suficiente");
    }      
    if ((media >= 6) && (media <= 7)) {
      System.out.println("Bien");
    }
	if (media == 8) {
      System.out.println("Notable");
    }
    if ((media >= 9) && (media <= 10)) {
      System.out.println("Sobresaliente");
	
	
	}
  }
}
