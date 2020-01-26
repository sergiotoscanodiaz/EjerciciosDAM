package elcortesislandes;

public class ElCortesIslandes {

  public static void main(String[] args) {

    TarjetaDeRegalo t1 = new TarjetaDeRegalo(100);
    TarjetaDeRegalo t2 = new TarjetaDeRegalo(120);
    
    System.out.println(t1);
    System.out.println(t2);
    t1.gasta(45.90);
    t2.gasta(5);
    t2.gasta(200);
    t1.gasta(3.55);
    System.out.println(t1);
    System.out.println(t2);
    
    TarjetaDeRegalo t3 = t1.fusionaCon(t2);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);

  }

}
