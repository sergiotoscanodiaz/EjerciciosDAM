import matematicas.VariasFunciones;

public class Ejercicio18 {
  
  /**
   * 
   * Programa que pasa de 
   * decimal a binario
   * 
   * */

 
  public static void main(String[] args) {
    
    System.out.print("Introduzca un para pasarlo a binario: ");
    int decimal = Integer.parseInt(System.console().readLine());
    
    System.out.println(decimal + " en decimal es " + decimalABinario(decimal) + " en binario.");
    
  } 
  public static long decimalABinario(int decimal) {
  
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = matematicas.VariasFunciones.pegaPorDetras(binario, decimal % 2);
      decimal = decimal / 2;
    }
    binario = matematicas.VariasFunciones.pegaPorDetras(binario, 1);
    binario = matematicas.VariasFunciones.voltea(binario);
    binario = matematicas.VariasFunciones.quitaPorDetras(binario, 1);
    
    return binario;
  }
}


