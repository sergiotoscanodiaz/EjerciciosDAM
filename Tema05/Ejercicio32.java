public class Ejercicio32 {

  public static void main(String[] args) {
        
    int numeroIntroducido = 0;
    int sumaNumPar = 0;
    int par = 0;

    System.out.println("Este programa ,dado un número entero positivo, muestra cuáles son y cuánto suman los dígitos pares..");
  

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
     
		  if((numeroIntroducido % 2) == 0) {
			  sumImp += numeroIntroducido;
			  numeroNumImp++;
		  } else {
			  if (numeroIntroducido > par)
			    par = numeroIntroducido;			  
          }
	  }
  }
    
    System.out.println("El usuario ha introducido " + numeros + " numeros");
    System.out.println("La media de los impares es " +sumImp / numeroNumImp);
    System.out.println("El numero par máximo es el " + par);
  }
}
    
 









/*Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22
Ejemplo 2:
Por favor, introduzca un número entero positivo: 31779
Dígitos pares:
Suma de los dígitos pares: 0
Ejemplo 3:
Por favor, introduzca un número entero positivo: 2404
Dígitos pares: 2 4 0 4
Suma de los dígitos pares: 10*/
