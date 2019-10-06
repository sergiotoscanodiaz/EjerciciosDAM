public class Ejercicio22 {
  public static void main(String[] args) {
   
    System.out.println("Este programa es para saber cuánto queda para el fin de semana (se considera que este comienza a las 15:00 del viernes)");
    System.out.print("Introduzca la día de la semana: ");
    String día = (System.console().readLine());
    
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minutosTranscurridos = (hora * 60) + (minutos);
    int minutosHastaFindeSemana = (24 * 60) - minutosTranscurridos;
    
    System.out.printf("Hasta el fin de semana faltan %d minutos", minutosHastaFindeSemana);
    
    
  }
}  
  
