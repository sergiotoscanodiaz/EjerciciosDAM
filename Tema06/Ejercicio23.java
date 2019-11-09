public class Ejercicio23 {
  public static void main(String[] args) {
    
    System.out.println("Este es un programa que genera de forma aleatoria la tirada de cinco dados: ");
    
     String dados = " ";
     
    for(int i = 1; i <=5; i++){   
    
    switch((int)(Math.random()*6)) {
      case 0:
        dados = " As "; 
        break;
      case 1:
         dados = " Q ";
        break;
      case 2:
         dados = " K ";
        break;
      case 3:
         dados = " J ";
        break;
      case 4:
         dados = " 7 ";
        break;
      case 5:
        dados = " 8 ";
        break;
      default:
    }
      System.out.print(dados + " ");
    }
  }
}
