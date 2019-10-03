public class Ejercicio11 {
  public static void main(String[] args) {
   
    System.out.println("Este programa es para saber cuánto queda para la medianoche a partir de una hora y unos minutos.");
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundosTranscurridos = (hora * 3600) + (minutos * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
    
    System.out.printf("Hasta la medianoche faltan %d segundos", hora, minutos, segundosHastaMedianoche);
    
    
  }
}  
  
  
  
  
  
  
