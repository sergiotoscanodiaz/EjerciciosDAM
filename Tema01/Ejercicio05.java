public class Ejercicio05 { 
  public static void main(String[] args) {

	String	rojo = "\033[31m";
	String	verde = "\033[32m";
	String	naranja = "\033[33m";
	String	azul = "\033[34m";
	String	morado = "\033[35m";
	String	blanco = "\033[37m";
    System.out.printf("%-5s %-5s %-5s %-5s %-5s\n",rojo +"PRO",naranja +"EDD", rojo +"PRO", rojo +"PRO", morado +"SINF");
    System.out.printf("%-5s %-5s %-5s %-5s %-5s\n",rojo +"PRO",azul +"LM", rojo +"PRO", rojo +"PRO", morado +"SINF");
    System.out.printf("%-5s %-5s %-5s %-5s %-5s\n",rojo +"PRO", azul +"LM", rojo +"PRO", naranja +"EDD", morado +"SINF");
    System.out.printf("%-5s %-5s %-5s %-5s %-5s\n",verde +"BBDD", morado +"SINF", verde +"BBDD", naranja +"EDD", blanco +"FOL");
    System.out.printf("%-5s %-5s %-5s %-5s %-5s\n",verde +"BBDD", morado +"SINF", verde +"BBDD", azul +"LM", blanco +"FOL");
    System.out.printf("%-5s %-5s %-5s %-5s %-5s\n",verde +"BBDD", morado +"SINF", verde +"BBDD", azul +"LM", blanco +"FOL");
    }
}

