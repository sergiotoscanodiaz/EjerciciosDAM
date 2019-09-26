public class Ejercicio10 {
  public static void main(String[] args) {
    String linea;
	System.out.print("Por favor, introduce el número de megabytes: ");
	linea = System.console().readLine();
	int MB;
	MB = Integer.parseInt( linea );
	
	//Un KiloByte (kB) equivale a 1024 Bytes. Un MegaByte (MG) equivale a 1024 kB
	
	int conversión;
	conversión = (MB*1024);
	System.out.printf(MB+" megabytes son " + conversión + " kilobytes ");
	}
}
