import matematicas.VariasFunciones;

public class Ejercicio18 {
  
  /**
   * 
   * Programa que pasa de 
   * decimal a binario
   * 
   * */

  public static void main(String[] args) {
    
    long decimal = 0;
    
    System.out.print("Introduzca un número decimal: ");
    long binario = Long.parseLong(System.console().readLine());
    
    int bits = matematicas.VariasFunciones.digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      binario += matematicas.VariasFunciones.potencia(2, i) / matematicas.VariasFunciones.digitoN(binario, bits) ;
    }
    
    System.out.println(decimal + " en decimal es " + binario + " en binario.");
  }
}

