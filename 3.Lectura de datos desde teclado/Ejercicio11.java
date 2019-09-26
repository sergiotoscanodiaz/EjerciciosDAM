public class Ejercicio11 {
  public static void main(String[] args) {
    String linea;
	System.out.print("Por favor, introduce el número de kilobytes: ");
	linea = System.console().readLine();
	int KB;
	KB = Integer.parseInt( linea );
	
	//Un KiloByte (kB) equivale a 1024 Bytes. Un MegaByte (MG) equivale a 1024 kB
	
	int conversión;
	conversión = (KB/1024);
	System.out.printf(KB+" kilobytes son " + conversión + " megabytes ");
	}
}
