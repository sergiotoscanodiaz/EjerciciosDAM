public class Ejercicio15 {
  public static void main(String[] args) {
  
    int[] mesa = new int[10];
    
    for (int i = 0; i < 10; i++) {
      mesa[i] = (int)(Math.random() * 5);
    }
        
    int clientes; 
    
    do {
      System.out.println("\n┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
      System.out.print("│Mesa nº: ");
      for (int i = 1; i < 11; i++) {
        System.out.printf("│ %2d ", i);
      }
      System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
      System.out.print("│Ocupación");
      for (int m : mesa) {
        System.out.printf("│ %2d ", m);
      }
      System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
      
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      clientes = Integer.parseInt(System.console().readLine());

      if (clientes > 4) { 
        System.out.print("Lo siento, no admitimos grupos de 6, haga grupos de");
        System.out.println(" 4 personas como máximo e intente de nuevo.");
      } else {
 
        int iVacia = 0;
        boolean hayMesaVacia = false;
        for(int i = 9; i >= 0; i--) {
          if (mesa[i] == 0) {
            iVacia = i;
            hayMesaVacia = true;
          }
        }
      
        if (hayMesaVacia) {
          mesa[iVacia] = clientes;
          System.out.println("Por favor, siéntense en la mesa número " + (iVacia + 1) + ".");
        } else {
          int iHueco = 0;
          boolean hayHueco = false;
          for(int i = 9; i >= 0; i--) {
            if (clientes <= (4 - mesa[i])) {
              iHueco = i;
              hayHueco = true;
            }
          }
          
          if (hayHueco) {
            mesa[iHueco] += clientes;
            System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (iHueco + 1) + ".");
          } else {
            System.out.println("Lo siento, en estos momentos no queda sitio.");
          }
        }
      }
    } while (clientes != -1);

  }
}


