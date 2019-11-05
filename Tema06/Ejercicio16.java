public class Ejercicio16 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que realiza un simulador de máquina tragaperras simplificada: ");
    
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    
    for(int i = 1; i <=3; i++){
    int figura = (int)(Math.random()*5);
    
   switch(figura) {
        case 0:
          System.out.print("corazón ");
          break;
        case 1:
          System.out.print("diamante ");
          break;
        case 2:
          System.out.print("herradura ");
          break;
        case 3:
          System.out.print("campana ");
          break;
        case 4:
          System.out.print("limón ");
          break;
        default:
      }
      
      switch(i) {
        case 0:
          figura1 = figura;
          break;
        case 1:
          figura2 = figura;
        break;
        case 2:
          figura3 = figura;
        break;
        default:
      }
    }
    
    System.out.println();

    if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
      System.out.print("Lo siento, inténtelo de nuevo.");
    } else if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.print("Ha ganado 10 monedas. ¡Sigue así!");
    } else {
      System.out.println("Bien, ha recuperado su moneda.");
    }
  }
}

