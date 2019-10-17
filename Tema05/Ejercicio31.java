public class Ejercicio31 {
  public static void main(String[] args) {
      
    System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }

    for (int j = 0; j < altura / 2 + 1; j++) {
      System.out.print("*");
    }

  }
}

    /*Si el ejercicio te pide que pintes la L con otro caracter se añadiría:
     * System.out.println("Introduzca el caracter con el que quiere pintar la Pirámide: ");	
	   * String caracter = (System.console().readLine()); 
     * Y para terminar cuando imprimimos por pantalla el caracter debemos cambiar '*' por caracter*/
