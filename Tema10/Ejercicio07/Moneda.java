public class Moneda {
  
  private static String tipos[] = {"cara", "cruz"};
  private static String valores[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
  private String valor;
  private String tipo;

  public Moneda() {
    this.tipo = tipos[(int)(Math.random()*2)];
    this.valor = valores[(int)(Math.random()*8)];
  }

  public String getTipo() {
    return this.tipo;
  }
  
  public String getValor() {
    return this.valor;
  }

  public String toString() {
    return this.valor + " - " + this.tipo;
  }
  
}
