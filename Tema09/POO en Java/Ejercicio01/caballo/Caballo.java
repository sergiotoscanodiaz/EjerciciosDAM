
package caballo;

class Caballo {
  
  private String nombre;
  private String color;
  private int edad;
  private int carrerasGanadas;
  
  Caballo (String n, String c, int e, int cg) {
    this.nombre = n;
    this.color = c;
    this.edad = e;
    this.carrerasGanadas = cg;
  }
  
  public String getNombre() {
    return this.nombre;
  }

   void cabalga() {
    System.out.println("Tocotoc tocotoc tocotoc");
  }

   void relincha() {
    System.out.println("Hiiiiiiieeeeee");
  }

   void rumia() {
    System.out.println("Ñam ñam ñam");
  }
}
  
