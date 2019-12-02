import array.Array;

public class Ejercicios20al28 {

  public static void main(String[] args) {
    
    int[] a = array.Array.generaArrayInt(20, 0, 100);
    
    array.Array.muestraArrayInt(a);
    System.out.println("Mínimo: " + array.Array.minimoArrayInt(a));
    System.out.println("Máximo: " + array.Array.maximoArrayInt(a));
    System.out.println("Media: " + array.Array.mediaArrayInt(a));
    
    if (array.Array.estaEnArrayInt(a, 20)) {
      System.out.println("El 20 está en el array.");
    } else {
      System.out.println("El 20 no está en el array generado.");
    }
      
    System.out.println("El 20 está en la posición " + array.Array.posicionEnArrayInt(a, 20));
    
    System.out.print("Array generado al revés: ");
    array.Array.muestraArrayInt(array.Array.volteaArrayInt(a));
    
    System.out.print("Array generado rotado 2 posiciones a la derecha: ");
    array.Array.muestraArrayInt(array.Array.rotaDerechaArrayInt(a, 2));
    
    System.out.print("Array generado rotado 2 posiciones a la izquierda: ");
    array.Array.muestraArrayInt(array.Array.rotaIzquierdaArrayInt(a, 2));
  }
}
