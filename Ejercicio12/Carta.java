package Ejercicios.Ejercicio12;

import java.util.Objects;

public class Carta implements Comparable<Carta>{

  private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
  private static String[] p = {"bastos", "copas", "espadas", "oros"};
  
  private Integer numero;
  private String palo;

  public Carta() {
    this.numero = (int)(Math.random()*10);
    this.palo = p[(int)(Math.random()*4)];
  }
  
  public int getNumero() {
    return numero;
  }

  public String getFigura() {
    return n[numero];
  }

  public String getPalo() {
    return palo;
  }

  @Override
  public String toString() {
    return n[numero] + " de " + palo;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 79 * hash + Objects.hashCode(this.numero);
    hash = 79 * hash + Objects.hashCode(this.palo);
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
    final Carta other = (Carta) obj;
    if (!Objects.equals(this.palo, other.palo)) {
      return false;
    }
    if (!Objects.equals(this.numero, other.numero)) {
      return false;
    }
    return true;
  }

  @Override
  public int compareTo(Carta t) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  
}
