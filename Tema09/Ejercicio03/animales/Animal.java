package animales;

public class Animal {
  private Sexo sexo;
  private double peso; //peso en kg
  private String nombreCientifico;

  public Animal() {
    this.sexo = Sexo.MACHO;
  }

  public Animal (Sexo x) {
    this.sexo = x;
  }

  public Animal(String nombreCientifico) {
    this.nombreCientifico = nombreCientifico;
  }

  public Animal(Sexo sexo, double peso, String nombreCientifico) {
    this.sexo = sexo;
    this.peso = peso;
    this.nombreCientifico = nombreCientifico;
  }  

  public Sexo getSexo() {
    return this.sexo;
  }

  public String toString() {
    return "Sexo: " + this.sexo + "\n";
  }
  
  /**
   * Hace que el animal se eche a dormir.
   */
  public void duerme() {
    System.out.println("Zzzzzzz");
  }
  
  public void come() {
    System.out.println("¡Qué rico!");
  }
  
  public void come(String comida) {
    System.out.println("¡Qué rico, me gusta comer " + comida + "!");
  }
}
