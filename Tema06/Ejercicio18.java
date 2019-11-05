public class Ejercicio18 {

  public static void main(String[] args) {
    
    System.out.println("Este es un programa que elige tres colores para pintar tres dormitorios: ");
    
    int col1;
    int col2;
    int col3;

    do {
      col1 = (int)(Math.random() * 6);
      col2 = (int)(Math.random() * 6);
      col3 = (int)(Math.random() * 6);
    } while ((col1 == col2) || (col1 == col3) || (col2 == col3));


    String color1 = "";
    
    switch(col1) {
      case 0:
        color1 = "rojo";
        break;
      case 1:
        color1 = "azul";
        break;
      case 2:
        color1 = "verde";
        break;
      case 3:
        color1 = "amarillo";
        break;
      case 4:
        color1 = "violeta";
        break;
      case 5:
        color1 = "naranja";
        break;
      default:
    }

    String color2 = "";
    
    switch(col2) {
      case 0:
        color2 = "rojo";
        break;
      case 1:
        color2 = "azul";
        break;
      case 2:
        color2 = "verde";
        break;
      case 3:
        color2 = "amarillo";
        break;
      case 4:
        color2 = "violeta";
        break;
      case 5:
        color2 = "naranja";
        break;
      default:
    }

    String color3 = "";
    
    switch(col3) {
      case 0:
        color3 = "rojo";
        break;
      case 1:
        color3 = "azul";
        break;
      case 2:
        color3 = "verde";
        break;
      case 3:
        color3 = "amarillo";
        break;
      case 4:
        color3 = "violeta";
        break;
      case 5:
        color3 = "naranja";
        break;
      default:
    }

    System.out.print(color1 + ", " + color2 + ", " + color3);
  }
}
