import java.util.ArrayList;

public class Eurocoin {

  public static void main(String[] args) {
    
    ArrayList<Moneda> m = new ArrayList<Moneda>();
    
    Moneda monedaAux = new Moneda();
    m.add(monedaAux);
    
    String ultimoTipo = monedaAux.getTipo();
    String ultimoValor = monedaAux.getValor();
    
    for (int i = 0; i < 5; i++) {
      do {
        monedaAux = new Moneda();
      } while (!((monedaAux.getTipo()).equals(ultimoTipo)) && !((monedaAux.getValor()).equals(ultimoValor)));
      
      m.add(monedaAux);
      ultimoTipo = monedaAux.getTipo();
      ultimoValor = monedaAux.getValor();
    }
    
    for (Moneda mo : m) {
      System.out.println(mo);
    }
    
  }
  
}
