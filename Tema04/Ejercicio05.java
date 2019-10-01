public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.print("Este programa realiza ecuaciones de primer grado del tipo ax + b = 0. Para empezar introduce el valor de a: ");
   
    Double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el valor de b: ");   
    Double b = Double.parseDouble(System.console().readLine());

	if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
