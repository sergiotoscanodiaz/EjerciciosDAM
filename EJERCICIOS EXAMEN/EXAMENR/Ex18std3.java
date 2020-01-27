//Sergio Toscano Díaz
//1ºDAM
//15/01/2019

public class Ex18std3 {

  public static void main(String[] args) {
    
    System.out.println("Notas de un boletín: "); //Para que se sepa que son notas de un boletín
    
    for(int i = 0; i < 6; i++){
      System.out.println(aleatorio(1, 10)); //Este print genera números aleatorios entre 0 y 10.
    }// for que muestra 6 números aleatorios.
    
  }
  
  ///FUNCIONES//////////////////////////////////////////////7
    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
    
}

