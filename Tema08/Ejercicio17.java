import matematicas.VariasFunciones;

public class Ejercicio17 {
  
  /**
   * 
   * Programa que pasa de 
   * binario a decimal
   * 
   * */

  public static void main(String[] args) {
    
    long decimal = 0;
    
    System.out.print("Introduzca un número binario: ");
    long binario = Long.parseLong(System.console().readLine());
    
    int bits = matematicas.VariasFunciones.digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += matematicas.VariasFunciones.digitoN(binario, bits) * matematicas.VariasFunciones.potencia(2, i);
    }
    
    System.out.println(binario + " en binario es " + decimal + " en decimal.");
  }
}


