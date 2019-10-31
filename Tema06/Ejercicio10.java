public class Ejercicio10 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que pinta por pantalla diez líneas formadas por caracteres: ");
    
    String caracteres = "";
    
    for(int i = 1; i <=10; i++){
    int longitud = (int)(Math.random()*40)+1;
    int c = (int)(Math.random()*6);
    
    switch (c) {
      case 1:
      caracteres = "*";      
      break;      
      case 2:
       caracteres = "-";      
      break;
      case 3:
       caracteres = "=";      
      break;
      case 4:
      caracteres=".";      
      break;
      case 5:
      caracteres="|";      
      break;
      case 6:
      caracteres="@";      
      break;
      default:
    }
    
    for(int j = 1; j <= longitud; j++) {
        System.out.print(caracteres);
      }
      System.out.println();
    }
  }
}
