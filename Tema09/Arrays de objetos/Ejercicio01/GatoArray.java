
public class GatoArray {

  public static void main(String[] args) {
    
    Gato[] gato = new Gato[4];

    int i;

    System.out.println("Por favor, introduzca los datos de los gatos.");
  
    for (i = 0; i < 4; i++) {
      gato[i] = new Gato();
      System.out.println("Gato nº " + (i + 1));
      System.out.print("Nombre: ");
      gato[i].setNombre(System.console().readLine());
      System.out.print("Color: ");
      gato[i].setColor(System.console().readLine());
      System.out.print("Raza: ");
      gato[i].setRaza(System.console().readLine());
    }

    System.out.println("Datos de todos los gatos.");

    for (i = 0; i < 4; i++) {
      System.out.println("Gato nº" + (i + 1));
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Raza: " + gato[i].getRaza());
    }
    
  }
  
}
