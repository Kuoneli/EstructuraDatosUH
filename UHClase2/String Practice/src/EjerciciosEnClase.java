import java.util.Scanner;

public class EjerciciosEnClase {
   
   public void EjerciciosEnClase(){
    Scanner scan = new Scanner(System.in);
    String cadena = "Estructura de dAtos", cadena2 = "Informatica";
    // Date fecha = new Date();

    System.out.println("Subcadena: " + cadena.substring(5, 11));
    System.out.println(cadena.concat(cadena2));
    System.out.println(cadena.equals(cadena2));

    String ch = new String("Patatas a ");
    double x = 11.2;
    System.out.println(ch = ch + x + " Euros");

    String bg;
    bg = 2 + 4 + " Mares";
    System.out.println(bg);
    bg = 2 + (4 + " Mares");
    System.out.println(bg);
    bg = "Mares " + 2 + 4;
    System.out.println(bg);

    // StringBuffer x = new StringBuffer();

    String Str = new String("Estructuras de Datos - Heredia");
    String subStr1 = new String("de");
    String subStr2 = new String("Datos");

    System.out.println("Posicion Index : ");
    System.out.println(Str.indexOf('u'));
    System.out.println("Posicion Index : ");
    System.out.println(Str.indexOf('u', 7));
    System.out.println("Posicion Index : ");
    System.out.println(Str.indexOf(subStr1));
    System.out.println("Posicion Index : ");
    System.out.println(Str.indexOf(subStr1, 17));
    System.out.println("Posicion Index : ");
    System.out.println(Str.indexOf(subStr2));

    String persona = "Persona Casada Anciana";

    System.out.println(persona.split(" "));

    
    int posicion;
    char caracter;
    String original, invertida = new String();
    System.out.println("Introduzca la cadena");
    original = scan.nextLine();
    posicion = original.length() - 1;
    while (posicion >= 0) {
        caracter = original.charAt(posicion);
        invertida = invertida + caracter;
        posicion--;
    }
    System.out.println("Cadena :" + invertida);

    String cadena1, subcadena;
    int posicion1 = 0, apariciones = 0;
    System.out.println("Introduzca la cadena en la que buscar");



   }
   
    
}
