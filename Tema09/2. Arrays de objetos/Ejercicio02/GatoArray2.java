public class GatoArray2 {
  public static void main(String[] args) {
    Gato[] gato = new Gato[4];

    int i;

    gato[0] = new Gato("Garfield", "naranja", "mestizo");
    gato[1] = new Gato("Perseo", "negro", "persa");
    gato[2] = new Gato("Leia", "blanco", "persa");
    gato[3] = new Gato("Ulises", "marrón", "persa");

    System.out.println("Datos de todos los gatos.");
    
    for (i = 0; i < 4; i++) {
      System.out.println("\nGato nº" + (i + 1));
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Raza: " + gato[i].getRaza());
    }
  }
}
