
package caballo;

public class Prueba {

  public static void main(String[] args) {
    
    Caballo b = new Caballo("Avra", "marrón moteado", 6, 24);
    Caballo l = new Caballo("Lykos", "negro", 8, 61);
    
    System.out.println("Hola, me llamo " + b.getNombre());
    b.cabalga();
    b.relincha();
      
    System.out.println("Hola, yo soy " + l.getNombre());
    l.rumia();
    l.cabalga();
  }
}
