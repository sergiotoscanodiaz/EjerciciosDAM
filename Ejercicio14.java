package Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio14 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
   
    HashMap<String, Double> productos = new HashMap<>();
  
    productos.put("avena", 2.21);
    productos.put("garbanzos", 2.39);
    productos.put("tomate", 1.59);
    productos.put("jengibre", 3.13);
    productos.put("quinoa", 4.50);
    productos.put("guisantes", 1.60);
    
    String productoIntroducido = "";
    int cantidadIntroducida = 0;

    ArrayList<String> listaProductos = new ArrayList<>();
    ArrayList<Integer> listaCantidades = new ArrayList<>();
    
    do {
      System.out.print("Producto: ");
      productoIntroducido = s.nextLine();
      
      if (!productoIntroducido.equals("fin")) {
        System.out.print("Cantidad: ");
        cantidadIntroducida = Integer.parseInt(s.nextLine());
        listaProductos.add(productoIntroducido);
        listaCantidades.add(cantidadIntroducida);
      }
      
    } while (!productoIntroducido.equals("fin"));
    
    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");
    
    double total = 0;
    
    for (int i = 0; i < listaProductos.size(); i++) {
      String producto = listaProductos.get(i);
      double precio = productos.get(producto);
      int cantidad = listaCantidades.get(i);
      double subtotal = precio * cantidad;
      total += subtotal;
      System.out.printf("%-8s %7.2f %6d  %7.2f\n", producto, precio, cantidad, subtotal);
    }
    
    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %.2f", total);
  }
}
