package Ejercicios.Ejercicio05;

import java.util.Scanner;

public class Gestisimal {

  static int N = 100;

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    int opcion;
    int primeraLibre;
    int i;
    int stockIntroducido;
    double precioDeCompraIntroducido;
    double precioDeVentaIntroducido;
    String codigo;
    String codigoIntroducido = "";
    String descripcionIntroducida;
    String precioDeCompraIntroducidoString;
    String precioDeVentaIntroducidoString;
    String stockIntroducidoString;
    boolean existeCodigo;

    Articulo[] articulo = new Articulo[N];

    for (i = 0; i < N; i++) {
      articulo[i] = new Articulo();
    }

    // Menu
    do {
      System.out.println("\n\nG E S T I S I M A L");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {

        // LISTADO //////////////////////////////////////////////////////////////////
        
        case 1:
          System.out.println("\nLISTADO");
          System.out.println("=======");

          for (i = 0; i < N; i++) {
            if (!articulo[i].getCodigo().equals("LIBRE")) {
              System.out.println(articulo[i]);
            }
          }

          break;

        // ALTA /////////////////////////////////////////////////////////////////////

        case 2:
          System.out.println("\nNUEVO ARTÍCULO");
          System.out.println("==============");

          // Busca la primera posición libre del array
          primeraLibre = 0;
          codigo = articulo[primeraLibre].getCodigo();
          while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
            primeraLibre++;
            if (primeraLibre < N) {
              codigo = articulo[primeraLibre].getCodigo();
            }
          }

          if (primeraLibre == N) {
            System.out.println("Lo siento, la base de datos está llena.");
          } else {

            // Introducción de datos 
            System.out.println("Por favor, introduzca los datos del artículo.");
            System.out.print("Código: ");

            // Comprueba que el código introducido no se repite
            existeCodigo = true;
            while (existeCodigo) {
              existeCodigo = false;
              codigoIntroducido = s.nextLine();

              for (i = 0; i < N; i++) {
                if (codigoIntroducido.equals(articulo[i].getCodigo())) {
                  existeCodigo = true;
                }
              }

              if (existeCodigo) {
                System.out.println("Ese código ya existe en la base de datos.");
                System.out.print("Introduzca otro código: ");
              }
            } // while (existeCodigo)

            articulo[primeraLibre].setCodigo(codigoIntroducido);

            System.out.print("Descripcion: ");
            descripcionIntroducida = s.nextLine();
            articulo[primeraLibre].setDescripcion(descripcionIntroducida);

            System.out.print("Precio de compra: ");
            precioDeCompraIntroducido = Double.parseDouble(s.nextLine());
            articulo[primeraLibre].setPrecioDeCompra(precioDeCompraIntroducido);

            System.out.print("Precio de venta: ");
            precioDeVentaIntroducido = Double.parseDouble(s.nextLine());
            articulo[primeraLibre].setPrecioDeVenta(precioDeVentaIntroducido);

            System.out.print("Stock: ");
            stockIntroducido = Integer.parseInt(s.nextLine());
            articulo[primeraLibre].setStock(stockIntroducido);
          }

          break;
 
        // BAJA /////////////////////////////////////////////////////////////////////
   
        case 3:
          System.out.println("\nBAJA");
          System.out.println("====");

          System.out.print("Por favor, introduzca el código del artículo que desea dar de baja: ");
          codigoIntroducido = s.nextLine();

          i = -1;
          codigo = "";
          do {
            i++;
            if (i < N) {
              codigo = articulo[i].getCodigo();
            }
          } while (!(codigo.equals(codigoIntroducido)) && (i < N));

          if (i == N) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            articulo[i].setCodigo("LIBRE");
            System.out.println("articulo borrado.");
          }

          break;

        // MODIFICACIÓN /////////////////////////////////////////////////////////////
          
        case 4:
          System.out.println("\nMODIFICACIÓN");
          System.out.println("============");

          System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
          codigoIntroducido = s.nextLine();

          i = -1;
          do {
            i++;
          } while (!((articulo[i].getCodigo()).equals(codigoIntroducido)));

          System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");

          System.out.println("Código: " + articulo[i].getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntroducido = s.nextLine();
          if (!codigoIntroducido.equals("")) {
            articulo[i].setCodigo(codigoIntroducido);
          }

          System.out.println("Descripción: " + articulo[i].getDescripcion());
          System.out.print("Nueva descripción: ");
          descripcionIntroducida = s.nextLine();
          if (!descripcionIntroducida.equals("")) {
            articulo[i].setDescripcion(descripcionIntroducida);
          }

          System.out.println("Precio de compra: " + articulo[i].getPrecioDeCompra());
          System.out.print("Nuevo precio de compra: ");
          precioDeCompraIntroducidoString = s.nextLine();
          if (!precioDeCompraIntroducidoString.equals("")) {
            articulo[i].setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
          }
          System.out.println("Precio de venta: " + articulo[i].getPrecioDeVenta());
          System.out.print("Nuevo precio de venta: ");
          precioDeVentaIntroducidoString = s.nextLine();
          if (!precioDeVentaIntroducidoString.equals("")) {
            articulo[i].setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
          }
          System.out.println("Stock: " + articulo[i].getStock());
          System.out.print("Nuevo stock: ");
          stockIntroducidoString = s.nextLine();
          if (!stockIntroducidoString.equals("")) {
            articulo[i].setStock(Integer.parseInt(stockIntroducidoString));
          }
          break;
         
        // ENTRADA DE MERCANCÍA /////////////////////////////////////////////////////

        case 5:
          System.out.println("\nENTRADA DE MERCANCÍA");
          System.out.println("====================");

          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.nextLine();

          i = -1;
          codigo = "";
          do {
            i++;
            if (i < N) {
              codigo = articulo[i].getCodigo();
            }
          } while (!(codigo.equals(codigoIntroducido)) && (i < N));

          if (i == N) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            System.out.println("Entrada de mercancía del siguiente artículo: ");
            System.out.println(articulo[i]);
            System.out.print("Introduzca el número de unidades que entran al almacén: ");
            stockIntroducidoString = s.nextLine();
            articulo[i].setStock(Integer.parseInt(stockIntroducidoString) + articulo[i].getStock());
            System.out.println("La mercancía ha entrado en el almacén.");
          }

          break;
      
        // SALIDA DE MERCANCÍA //////////////////////////////////////////////////////

        case 6:
          System.out.println("\nSALIDA DE MERCANCÍA");
          System.out.println("===================");

          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.nextLine();

          i = -1;
          codigo = "";
          do {
            i++;
            if (i < N) {
              codigo = articulo[i].getCodigo();
            }
          } while (!(codigo.equals(codigoIntroducido)) && (i < N));

          if (i == N) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            System.out.println("Salida de mercancía del siguiente artículo: ");
            System.out.println(articulo[i]);
            System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
            stockIntroducido = Integer.parseInt(s.nextLine());
            if (articulo[i].getStock() - stockIntroducido > 0) {
              articulo[i].setStock(articulo[i].getStock() - stockIntroducido);
              System.out.println("La mercancía ha salido del almacén.");
            } else {
              System.out.println("Lo siento, no se pueden sacar tantas unidades.");
            }
          }

          break;
      } // switch
    } while (opcion != 7); //bucle do-while
  }
}
