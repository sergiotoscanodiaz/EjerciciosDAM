package perrera;

public class Perrera {

    public static void main(String[] args) {
        Perro p1 = new Perro("Nora");
        Perro p2 = new Perro("Hugo");
        Perro p3 = new Perro("Aquiles");
        Perro p4 = new Perro();
        
        p1.ladra();
        p2.ladra(); 
        p4.ladra();
        
        p4.setNombre("Kiwi");        
        p4.ladra();
        System.out.println(p2.getNombre());
        
        p1.secomunicacon(p2);
    }
    
}
