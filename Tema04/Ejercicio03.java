public class Ejercicio03 {
  public static void main(String[] args) {

    int num;

    System.out.print("Introduzca un número desde el 1 al 7 y le diré el correspondiente día de la semana: ");
    num = Integer.parseInt(System.console().readLine()); 
    
    switch(num) {
      case 1: 
	    System.out.println("Lunes");    
	    break;   
      case 2: 
        System.out.println("Martes");
        break;       
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
      case 6:
        System.out.println("Sábado");
      case 7:
        System.out.println("Domingo");
        default:
		System.out.println("Debe introducir un número comprendido entre el 1 y el 7");
    }
  }
}
