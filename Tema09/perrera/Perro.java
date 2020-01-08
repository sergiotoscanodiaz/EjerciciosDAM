package perrera;

class Perro {
  //atributos (características)
  
   String color;
   String sexo;
   String raza;
   int edad;
   String nombre;
   String numeroChip;
  
  // métodos (comportamiento)
   public Perro() {
   }

   public Perro(String nombre) {
    this.nombre = nombre;
   }
                                                                                
   void ladra () {
    if (this.nombre == null) {
      System.out.print("Soy un perro anónimo"); 
    } else {
    System.out.print("Soy " + this.nombre);   
    }
    
    System.out.println(" Guauuu");
   }    

   public void setNombre(String nombre) {
        this.nombre = nombre;
   }

   public String getNombre() {
        return this.nombre;
   }

    void secomunicacon(Perro p1) {
       System.out.print("Hola " + this.nombre +", ¿qué tal?");
    }
  
}

