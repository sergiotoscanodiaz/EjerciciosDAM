public class Ejercicio21 {

  public static void main(String[] args) {
    
    int numeros = 0; 
    int numeroIntroducido = 0;
    int numeroNumImp = 0;
    int sumImp = 0;
    int par = 0;

    System.out.println("Este programa calcula la media de los números positivos impares introducidos.");
    System.out.println("El programa para introduciendo un número negativo):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if(numeroIntroducido >=0) {
		  numeros++;
		  if((numeroIntroducido % 2) == 1) {
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
