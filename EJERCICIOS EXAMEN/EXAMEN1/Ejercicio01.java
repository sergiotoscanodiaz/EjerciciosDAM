import java.util.Scanner;

public class Ejercicio01 {
  
  public static void main(String[] args) {
    
      Scanner s = new Scanner(System.in);
      
      System.out.println("Introduzca la cantidad de polos que desea (como mínimo deben ser 20): ");
      int polo = Integer.parseInt(s.nextLine()); 
   
      double precio = 0;
      
      if ((polo >= 20)& (polo < 40)) {
        precio = 4.90;
      } else if ((polo >= 40)& (polo < 100)) {
        precio = 3.90;
      } else {
        precio = 3.20;
      }
      
      System.out.println("1)blanco 2)color: ");
      int color = Integer.parseInt(s.nextLine()); 
   
      String pigmento = "";
   
      if (color == 2) {
        precio *= 1.2;
        pigmento = "color";
      } else  {
        pigmento = "blanco";
      }
      
      System.out.println("1)serigrafía 2)bordado: ");
      int logo = Integer.parseInt(s.nextLine()); 
      
      double precioLogo = 0;
      String logotipo = "";
   
      if (logo == 1) {
        precioLogo = 2;
        if (polo > 50){
          precioLogo = 1.5;
        }
        
        logotipo = "serigrafía";
        
      } else if (logo == 2) {
        precioLogo = 3;
        if (polo > 50){
          precioLogo = 2.5;
        }
        
        logotipo = "bordado";
      }
      
      System.out.println(""); 
         
      System.out.println("EL POLITO BONITO - PRESUPUESTO"); 
            
      System.out.println(""); 
      
      
      System.out.println("Polo en " + pigmento+ ": " + polo);      
      System.out.println("Precio unitario: " + precio + " €");
      System.out.println("Total textil: " + precio*polo + " €");
      System.out.println(logotipo + "(c.u): " + precioLogo + " €");
      System.out.println("Total " + logotipo + ": "+ precioLogo*polo + " €");
      System.out.println("Polo más logotipo: "+ (precio*polo + precioLogo*polo) + " €");
      System.out.println("IVA: " + (precio*polo + precioLogo*polo)*0.21);
      System.out.println("TOTAL: " + (precio*polo + precioLogo*polo + 0.21 *(precio*polo+precioLogo*polo)) + " €");
      
  } 
}

      
