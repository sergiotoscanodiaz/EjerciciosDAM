public class Ejercicio08 {

  public static void main(String[] args) {
    
    System.out.print("¿Qué tabla de multiplicar desea ver?: ");
    int tablaMult = Integer.parseInt(System.console().readLine());
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(tablaMult + " x " + i + " = " + tablaMult * i);
    }

  }
}
