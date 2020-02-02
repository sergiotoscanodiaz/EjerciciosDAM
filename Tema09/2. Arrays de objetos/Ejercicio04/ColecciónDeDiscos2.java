public class ColecciónDeDiscos2 {

  static int N = 100;
  
  public static void main(String[] args) {

    int i;
    String codigoIntroducido = "";
    String codigo;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int opcion;
    int opcionListado;
    int duracionIntroducida;
    int primeraLibre = -1;
    int limiteInferior;
    int limiteSuperior;
    boolean existeCodigo = true;

    Disco[] album = new Disco[N];

    for(i = 0; i < N; i++) {
      album[i] = new Disco();
    }

    do {
      System.out.println("\nCOLECCIÓN DE DISCOS");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {

      case 1:
        do {
          System.out.println("\nLISTADO");
          System.out.println("1. Completo");
          System.out.println("2. Por autor");
          System.out.println("3. Por género");
          System.out.println("4. En un rango de duración");
          System.out.println("5. Menú principal");
          System.out.print("Introduzca una opción: ");
          opcionListado = Integer.parseInt(System.console().readLine());        
          
          switch (opcionListado) {

            case 1: 

              for(i = 0; i < N; i++) {
                if (!album[i].getCodigo().equals("LIBRE")) {
                  System.out.println("------------------------------------------");
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                  System.out.println("------------------------------------------");
                }
              }
              break;
              
            case 2: 
  
              System.out.print("Introduzca el autor: ");
              autorIntroducido = System.console().readLine();
              
              for(i = 0; i < N; i++) {
                if ( (!album[i].getCodigo().equals("LIBRE")) && (album[i].getAutor().equals(autorIntroducido)) ){
                  System.out.println("------------------------------------------");
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                  System.out.println("------------------------------------------");
                }
              }
              break;
              
            case 3: 
  
              System.out.print("Introduzca el género: ");
              generoIntroducido = System.console().readLine();
              
              for(i = 0; i < N; i++) {
                if ( (!album[i].getCodigo().equals("LIBRE")) && (album[i].getGenero().equals(generoIntroducido)) ){
                  System.out.println("------------------------------------------");
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                  System.out.println("------------------------------------------");
                }
              }
              break;

            case 4:
  
              System.out.println("Establezca el intervalo para la duración");
              System.out.print("Introduzca el límite inferior de duración en minutos: ");
              limiteInferior = Integer.parseInt(System.console().readLine());
              System.out.print("Introduzca el límite superior de duración en minutos: ");
              limiteSuperior = Integer.parseInt(System.console().readLine());
              
              for(i = 0; i < N; i++) {
                if ( (!album[i].getCodigo().equals("LIBRE")) && (album[i].getDuracion() <= limiteSuperior) && (album[i].getDuracion() >= limiteInferior) ){
                  System.out.println("------------------------------------------");
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                  System.out.println("------------------------------------------");
                }
              }
              
          }
        } while (opcionListado != 5);

        break;

      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");

        primeraLibre = 0;
        codigo = album[primeraLibre].getCodigo();
        while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
          primeraLibre++;
          if (primeraLibre < N) {
            codigo = album[primeraLibre].getCodigo();
          }
        }
        
        if (primeraLibre == N) {
          System.out.println("Lo siento, la base de datos está llena.");
        } else {
          System.out.println("Por favor, introduzca los datos del disco.");  
          System.out.print("Código: ");

          existeCodigo = true;
          while (existeCodigo) {
            existeCodigo = false;
            codigoIntroducido = System.console().readLine();
            
            for (i = 0; i < N; i++)
              if (codigoIntroducido.equals(album[i].getCodigo())) {
                existeCodigo = true;
              }
            
            if (existeCodigo) {
              System.out.println("Ese código ya existe en la base de datos.");
              System.out.print("Introduzca otro código: ");
            }
          } 
          
          album[primeraLibre].setCodigo(codigoIntroducido);
          
          System.out.print("Autor: ");
          autorIntroducido = System.console().readLine();
          album[primeraLibre].setAutor(autorIntroducido);
          
          System.out.print("Título: ");
          tituloIntroducido = System.console().readLine();
          album[primeraLibre].setTitulo(tituloIntroducido);
          
          System.out.print("Género: ");
          generoIntroducido = System.console().readLine();
          album[primeraLibre].setGenero(generoIntroducido);
          
          System.out.print("Duración: ");
          duracionIntroducida = Integer.parseInt(System.console().readLine());
          album[primeraLibre].setDuracion(duracionIntroducida);
        }
        
        break;
        
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = System.console().readLine();
  
        i = -1;
        do {
          i++;
        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
        
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
  
        System.out.println("Código: " + album[i].getCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = System.console().readLine();
        if (!codigoIntroducido.equals("")) {
          album[i].setCodigo(codigoIntroducido);
        }

        System.out.println("Autor: " + album[i].getAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = System.console().readLine();
        if (!autorIntroducido.equals("")) {
          album[i].setAutor(autorIntroducido);
        }
        System.out.println("Título: " + album[i].getTitulo());
        System.out.print("Nuevo título: ");
        tituloIntroducido = System.console().readLine();
        if (!tituloIntroducido.equals("")) {
          album[i].setTitulo(tituloIntroducido);
        }
        System.out.println("Género: " + album[i].getGenero());
        System.out.print("Nuevo género: ");
        generoIntroducido = System.console().readLine();
        if (!generoIntroducido.equals("")) {
          album[i].setGenero(generoIntroducido);
        }
        System.out.println("Duración: " + album[i].getDuracion());
        System.out.print("Duración: ");
        duracionIntroducidaString = System.console().readLine();
        if (!duracionIntroducidaString.equals("")) {
          album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = System.console().readLine();
  
        i = -1;
        codigo = "";
        do {
          System.out.println(i);
          i++;
          if (i < N) {
            codigo = album[i].getCodigo();
          }
        } while (!(codigo.equals(codigoIntroducido)) && (i < N));
  
        System.out.println(i);

        if (i == N) {
          System.out.println("Lo siento, el código introducido no existe.");
        } else {
          album[i].setCodigo("LIBRE");
          System.out.println("Album borrado.");  
        }
          
      }
    } while (opcion != 5);
  }
}
