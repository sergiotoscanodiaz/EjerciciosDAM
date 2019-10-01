public class Ejercicio01 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
    dia = (System.console().readLine()); 
    dia.toLowerCase(); 
    
    switch(dia) {
      case "lunes": 
	    System.out.println("Programación");    
	    break;   
      case "martes": 
        System.out.println("Entornos de desarrollo");
        break;       
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Programación");
        break;
      case "viernes":
        System.out.println("Sistemas Informáticos");

    }
  }
}
