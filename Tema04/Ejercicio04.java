public class Ejercicio04 {
  public static void main(String[] args) {

    System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
    int horas = Integer.parseInt(System.console().readLine());
    int sueldo;
    
     if (horas < 40){
     sueldo = 12 * horas;
     System.out.println("El sueldo semanal es de " + sueldo + " euros");
     } else  {
	 sueldo = (40 * 12) + ((horas - 40) * 16);
	 System.out.println("El sueldo semanal es de " + sueldo + " euros");
  }
 }
}
    
