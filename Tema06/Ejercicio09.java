public class Ejercicio09 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que muestra números aleatorios pares entre 0 y 100 y que no termina de generar números hasta que no saque el 24: ");
    
    int contador = 0;
    for (int i = 0; i<=150; i++){
      int num = ((int) (Math.random()*101));
      if (num%2 ==0){
        System.out.print(num+" ");  
        contador++;  
      }  
      if (num==24){
        break;
      }
      
    }
    System.out.println();
    System.out.print("Han salido: "+contador+" números pares");
  }
}
