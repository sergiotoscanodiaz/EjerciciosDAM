package Ejercicios.Ejercicio18;

import java.util.Objects;

public class Elemento {

   private String producto;
  private double precio;
  private int cantidad;

  public Elemento(String producto, double precio, int cantidad) {
    this.producto = producto;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 53 * hash + Objects.hashCode(this.producto);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Elemento other = (Elemento) obj;
    if (!Objects.equals(this.producto, other.producto)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return this.producto + " PVP: " + String.format("%.2f", this.precio)
            + " Unidades: " + this.cantidad
            + " Subtotal: " + String.format("%.2f", this.precio * this.cantidad);
  }

}
