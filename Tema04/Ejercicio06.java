public class Ejercicio06 {
  public static void main(String[] args) {

    System.out.print("Este programa calcula el tiempo que un objeto tarda en caer. Introduzca un valor para la altura h: ");
      
    Double h = Double.parseDouble(System.console().readLine());
    double g = 9.81;

	if (h == 0) {
      System.out.println("El objeto no cae a ninguna altura.");
    } else {
      System.out.println("El valor del tiempo es = " + Math.sqrt((2*h)/g));
    }
  }
}
