public class Ejercicio06 {
  public static void main(String[] args) {
	  double baseImponible = 22.75;
	  
	  System.out.printf("Base imponible %10f\n" , baseImponible);
      System.out.printf("IVA     %10f\n" , (baseImponible*0.21));
      System.out.printf("Total   %10f\n" , (baseImponible*1.21));
  }
}
