//Sergio Toscano Díaz
//1ºDAM
//15/01/2019

import java.util.Scanner;

public class Ex18std4 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);    
    
    // Crea el array con valores aleatorios
    int[] n = new int[12];
    
    for (int i = 0; i < 12; i++) {
      n[i] = (int) (Math.random() * 201);
    }

    // Muestra el array original
    System.out.println("Array original:");
    
    System.out.print("\nÍndice ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", i);
    }
    
    System.out.print("\nValor  ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", n[i]);
    }
    
    System.out.println(" ");
    System.out.println(" ");
    
    //La posición del número que se desea borrar
    System.out.println("Introduzca la posición del número que quiere borrar (0 – 11): ");
    int posicion = Integer.parseInt(s.nextLine());
    
    //Desplazamiento hacia la izquierda
    for (int i = posicion; i < 11; i++) {
      n[i] = n[i + 1];
    }

     n[11] = 0;
    
    // Muestra el resultado
    System.out.println("\nArray resultado:");
    
    System.out.print("\nÍndice ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", i);
    }
    
    System.out.print("\nValor  ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", n[i]);
    }
  }
}
