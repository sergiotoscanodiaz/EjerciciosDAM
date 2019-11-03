public class Ejercicio15 {

  public static void main(String[] args) {
    
    int notas = 4 * (int)(Math.random() * 7 + 1);
    String nota = "";
    String primeraNota = "";

    for (int contador = 1; contador <= notas; contador++) {
      switch((int)(Math.random() * 7)) {
        case 0:
          nota = "do";
          break;
        case 1:
          nota = "re";
          break;
        case 2:
          nota = "mi";
          break;
        case 3:
          nota = "fa";
          break;
        case 4:
          nota = "sol";
          break;
        case 5:
          nota = "la";
          break;
        case 6:
          nota = "si";
          break;
        default:
      }

      if (contador == 1) {
        primeraNota = nota;
      }

      if (contador == notas) {
        nota = primeraNota;
      }

      System.out.print(nota + " ");

      if ( contador == notas ) {
        System.out.print("||");
      } else if ( contador % 4 == 0 ) {
        System.out.print("| ");
      }
      
    }
  }
}
