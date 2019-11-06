public class Ejercicio21 {
  public static void main(String[] args) {
    
    System.out.println("Este es un programa que realiza un simulador de máquina tragaperras simplificada: ");
    
    int moneda1 = 0;
    int moneda2 = 0;
    int moneda3 = 0;
    
    for(int i = 1; i <=3; i++){
    int moneda = (int)(Math.random()*5);
    
    switch(moneda) {
      case 0:
        System.out.print("1 céntimo "); 
        break;
      case 1:
        System.out.print(" 2 céntimos ");
        break;
      case 2:
        System.out.print(" 5 céntimos ");
        break;
      case 3:
        System.out.print(" 10 céntimos ");
        break;
      case 4:
        System.out.print(" 20 céntimos ");
        break;
      case 5:
        System.out.print(" 50 céntimos ");
        break;
      case 6:
        System.out.print(" 1 euro ");
        break;
      case 7:
        System.out.print(" 2 euros ");
        break;
      default:
    }
    }
  }
}
