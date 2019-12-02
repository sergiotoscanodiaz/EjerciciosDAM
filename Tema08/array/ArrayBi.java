package array;
import matematicas.VariasFunciones;

public class ArrayBi {
  
  //muestra el contenido del array bidimensional
  public static void muestraArrayBiInt(int x[][]) {
    // El tamaño de la columna será igual al tamaño del número máximo del array
    String formatoNumero = "%" + matematicas.VariasFunciones.digitos(maximoArrayBiInt(x)) + "d";

    for (int f = 0; f < x.length; f++) {
      for (int c = 0; c < x[0].length; c++) {
        System.out.printf(formatoNumero + " ", x[f][c]);
      }
      System.out.println();
    }
  }
  
  //29. generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
  public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
    int[][] x = new int[filas][columnas];

    for(int i = 0; i < filas; i++) {
      for(int j = 0; j < columnas; j++) {
        x[i][j] = (int)(Math.random()*(maximo - minimo) + minimo + 1);
      }
    }
      
    return x;
  }

  //muestra el máximo
  public static int maximoArrayBiInt(int x[][]) {
    int maximo = Integer.MIN_VALUE;
    
    for (int f = 0; f < x.length; f++) {
      for (int c = 0; c < x[0].length; c++) {
        if (x[f][c] > maximo) {
          maximo = x[f][c];
        }
      }
    }  

    return maximo;
  }


  //30. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
  public static int[] filaDeArrayBiInt(int x[][], int fila) {
    int[] f = new int[x[0].length];
    
    for (int c = 0; c < x[0].length; c++) {
      f[c] = x[fila][c];
    }
          
    return f;
  }

  //31. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como parámetro.
  public static int[] columnaDeArrayBiInt(int x[][], int columna) {
    int[] c = new int[x.length];
    
    for (int f = 0; f < x.length; f++) {
      c[f] = x[f][columna];
    }

    return c;
  }

  /*32. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
con dos elementos) de la primera ocurrencia de un número dentro de un
array bidimensional. Si el número no se encuentra en el array, la función
devuelve el array {-1, -1}. */
  public static int[] coordenadasEnArrayBiInt(int x[][], int n) {
    for (int f = 0; f < x.length; f++) {
      for (int c = 0; c < x[0].length; c++) {
        if (x[f][c] == n) {
          int[] coordenadas = {f, c};
          return coordenadas;
        }
      }
    }
    int[] coordenadas = {-1, -1};
    return coordenadas;
  }

  //33. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
  public static boolean esPuntoDeSilla(int x[][], int i, int j) {
    
    int[] fila = filaDeArrayBiInt(x, i);
    int[] columna = columnaDeArrayBiInt(x, j);
    
    return ((Array.minimoArrayInt(fila) == x[i][j])
        && (Array.maximoArrayInt(columna) == x[i][j]));
  }
  
  /*34. diagonal: Devuelve un array que contiene una de las diagonales del array
bidimensional que se pasa como parámetro. Se pasan como parámetros
fila, columna y dirección. La fila y la columna determinan el número que
marcará las dos posibles diagonales dentro del array. La dirección es
una cadena de caracteres que puede ser “nose” o “neso”. La cadena
“nose” indica que se elige la diagonal que va del noroeste hacia el sureste,
mientras que la cadena “neso” indica que se elige la diagonal que va del
noreste hacia el suroeste. */
  public static int[] diagonal(int x[][], int fila, int columna, String direccion) {
    
    int elementos = 0, i, j;
    int[] diagonalAux = new int [1000];
    
    for (i = 0; i < x.length; i++) {
      for (j = 0; j < x[0].length; j++) {
        if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
          || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
          diagonalAux[elementos++] = x[i][j];
        }
      }
    }

    int[] diagonal = new int[elementos];
    for (j = 0; j < elementos; j++) {
      diagonal[j] = diagonalAux[j];
    }

    return diagonal;
  }
}
