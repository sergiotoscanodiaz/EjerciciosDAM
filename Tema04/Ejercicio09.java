public class Ejercicio09 {
  public static void main(String[] args) {

    System.out.print("Este programa realiza ecuaciones de segundo grado del tipo ax² + bx + c = 0. Para empezar introduce el valor de a: ");
   
    Double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el valor de b: ");   
    Double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el valor de c: ");   
    Double c = Double.parseDouble(System.console().readLine());
      
    System.out.println("x = " + (-b + Math.sqrt(b * b - 4*(a * c))) / (2 * a)) ;
    
    System.out.println("x2 = " + (-b - Math.sqrt(b * b - 4*(a * c))) / (2 * a)) ;
   
   }
}

