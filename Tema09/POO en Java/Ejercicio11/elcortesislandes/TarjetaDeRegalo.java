package elcortesislandes;

import java.text.DecimalFormat;

public class TarjetaDeRegalo {
  
  String numero;
  double saldo;

  public TarjetaDeRegalo(double saldo) {
    this.saldo = saldo;
    
    // Genera un número de tarjeta aleatorio de 5 cifras
    this.numero = "";
    for (int i = 0; i < 5; i++) {
      this.numero += (int)(Math.random() * 10);
    }
  }
  
  
  //Método toString para mostrar el saldo de una tarjeta
  @Override
  public String toString() {
    DecimalFormat dosDecimales = new DecimalFormat("0.00");
    return "Tarjeta nº " + numero + " - Saldo " + dosDecimales.format(saldo) + "€";
  }
  
  //Método gasta
  void gasta(double gasto) {
    if (gasto > saldo) {
      System.out.printf("No tiene suficiente saldo para gastar %.2f€\n", gasto);
    } else {
      saldo -= gasto;
    }
  }
  
  //Método fusionaCon
  TarjetaDeRegalo fusionaCon(TarjetaDeRegalo t) {
    double nuevoSaldo = this.getSaldo() + t.getSaldo();
    this.setSaldo(0);
    t.setSaldo(0);
    return new TarjetaDeRegalo(nuevoSaldo);
  }

  //Setter
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  
  //Getter
  public double getSaldo() {
    return saldo;
  }  
  
}
