public class Ejercicio11 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que muestra 20 notas generadas al azar: ");
    
    int nota;
    int sus = 0;
    int suf = 0;
    int bie = 0;
    int not = 0;
    int sob = 0;
    
    for(int i = 0; i < 20; i++) {
      
      nota = (int)(Math.random() * 5);
      
      switch(nota) {
        case 0:
          System.out.println("suspenso ");
          sus++;
          break;
        case 1:
          System.out.println("suficiente ");
          suf++;
          break;
        case 2:
          System.out.println("bien ");
          bie++;
          break;
        case 3:
          System.out.println("notable ");
          not++;
          break;
        case 4:
          System.out.println("sobresaliente ");
          sob++;
          break;
        default:
      }

    }
    
    System.out.println();
    System.out.println("Número de suspensos: " + sus);
    System.out.println("Número de suficientes: " + suf);
    System.out.println("Número de bienes: " + bie);
    System.out.println("Número de notables: " + not);
    System.out.println("Número de sobresalientes: " + sob);
    
   
  }
}
