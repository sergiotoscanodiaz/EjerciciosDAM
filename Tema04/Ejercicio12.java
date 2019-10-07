public class Ejercicio12 {
  public static void main(String[] args) {

    int puntos = 0;
    String respuesta;
   
    System.out.println("¡Bienvenido! Esto un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso. Cada pregunta acertada sumará un punto. ¡Suerte! ");
    
    System.out.println("1.¿Cuál es el lenguaje de programación más utilizado en la fecha? ");
    System.out.println("a) C++ b) Python c) Java");
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
      
    
    System.out.println("2.¿Cuál es el lenguaje de programación que está ganando popularidad últimamente? ");
    System.out.println("a) C++ b) Python c) Java");
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;     
    }
    
    System.out.println("3.¿Cuál es el lenguaje utilizado para la edición de páginas web? ");
    System.out.println("a)C# b)HTML 8 c)CSS");
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("4.¿Cuál de los siguientes tipos de datos de Java tiene más precisión? ");
    System.out.println("a)float b)double c)int");
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("5.¿Cuál de los siguientes tipos de datos de Java es el utilizado para una cadena de caracteres? ");
    System.out.println("a)String b)double c)int");
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("6.¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?");
    System.out.println("a)SQL b)HTML c)Intel");
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("7.¿Cuál es la etiqueta usada para la separación por párrafos en HTML?");
    System.out.println("a)<br> b)<h1></h1> c)<p></p>");
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("8.¿ En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("a)/etc b)/linux c)/config");
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("9. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM b) EPROM c) ROM"); 
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("10. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("a) href b) a c) link"); 
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("11. Aplicación usada para trabajar con bases de datos en local: ");
    System.out.println("a) XAMPP b) Workbench c) Visual Studio Code"); 
    System.out.print("Escribe la respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
	  System.out.println("Has obtenido " + puntos + " puntos.");       
	 }
   }
 }
