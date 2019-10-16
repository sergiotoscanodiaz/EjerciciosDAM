public class Ejercicio25 {

  public static void main(String[] args) {
  
    System.out.println("Introduzca un número y le mostraré el mismo al revés. Los números desde el 0 al 9 no sufrirán conversión. ");
    int numero = Integer.parseInt(System.console().readLine());
    int numeroConvertido = 0;
    
    do{
      numeroConvertido = (numeroConvertido * 10) + (numero % 10);
      numero /= 10;
    } while(numero > 0);
    
     System.out.println("EL número convertido será: " +numeroConvertido);
    
  }
}
    
