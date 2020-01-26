package pruebatiempo;

public class PruebaTiempo {

  public static void main(String[] args) {
    
    Tiempo t1 = new Tiempo(18, 10, 30);
    Tiempo t2 = new Tiempo(1, 40, 40);
    Tiempo t3 = new Tiempo(0, 35, 20);
        
    System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
    System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
   
  }
  
}
