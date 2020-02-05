package ex18std.Ex18std3;

import java.util.ArrayList;

public class Carrito {
  
  ArrayList<Elemento> a = new ArrayList<>();

  public void agrega(Elemento e) {
    
      a.add(e);
  }

  public int numeroDeElementos() {
    return a.size();
  }

  public double importeTotal() {
    double total = 0;
    for (Elemento e : a) {

      total += e.getPrecio() * e.getCantidad();

    }
    return total;
  }

  @Override
  public String toString() {
    String contenido = "Contenido del carrito\n=====================\n";
    for (Elemento e : a) {
      contenido += e + "\n";
    }
    return contenido;
  }
   
}

