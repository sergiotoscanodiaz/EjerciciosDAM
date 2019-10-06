public class Ejercicio21 {
  public static void main(String[] args) {

    System.out.print("Este programa calcula la media de dos notas en la asignatura de Programación. Por favor, introduzca la primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2)/2 ;
    
    System.out.println("Tu nota en la asignatura de Programación es = " + media);
	
	if (media < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recuperacion = System.console().readLine();
    if (recuperacion.equals("apto")) {
        media = 5;
    }
    
    System.out.println("Tu nota en la asignatura de Programación es = " + media); 
  
    }
  }
}
