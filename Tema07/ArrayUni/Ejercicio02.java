public class Ejercicio02 {

public static void main(String[] args) {
    
    char[] sim = new char[10];
    
    sim[0] = 'a';
    sim[1] = 'x';
    sim[4] = '@';
    sim[6] = ' ';
    sim[7] = '+';
    sim[8] = 'Q';
          
    for (int i = 0; i < 10; i++) {
      System.out.println("sim[" + i + "]: " + sim[i]);
    }  
  }
}
