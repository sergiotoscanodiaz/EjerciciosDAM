import java.util.Scanner;

public class Ejercicio02 {
  
  public static void main(String[] args) {
    
      Scanner s = new Scanner(System.in);      
      int polos = 0;
      
      while (polos < 20){ 
      System.out.println("Introduzca la cantidad de polos que desea (como mínimo deben ser 20): ");
      polos = Integer.parseInt(s.nextLine());    
      
        if (polos < 20) {
          System.out.println("El pedido mínimo es de 20 polos. Inténtelo de nuevo."); 
        }
      }
      
      int polo = polos;
      double precio = 0;
      
          if ((polo >= 20)& (polo < 40)) {
            precio = 4.90;
          } else if ((polo >= 40)& (polo < 100)) {
            precio = 3.90;
          } else {
            precio = 3.20;
          } 
          
     
   
      String pigmento = "";
      
      int color = 0;
   
      while ((color != 1) & (color !=2)){
         System.out.println("1)blanco 2)color: ");
         color = Integer.parseInt(s.nextLine());
         
         if  ((color != 1) & (color !=2)){
          System.out.println("Debe ser 1 o 2. Inténtalo de nuevo. "); 
         }
      }
   
      if (color == 2) {
        precio *= 1.2;
        pigmento = "color";
      } else if (color == 1)  {
        pigmento = "blanco";
      }
      
      int logo = 0;
      
      while ((logo != 1) & (logo  !=2)) {
      System.out.println("1)serigrafía 2)bordado: ");
      logo = Integer.parseInt(s.nextLine()); 
      
        if  ((logo  != 1) & (logo  !=2)){
          System.out.println("Debe ser 1 o 2. Inténtalo de nuevo. "); 
         }
      }
      
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
