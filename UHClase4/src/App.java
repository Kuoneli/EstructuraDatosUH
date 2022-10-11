import javax.naming.InitialContext;
import javax.swing.JSpinner.NumberEditor;
import javax.swing.event.ListDataEvent;

public class App {
    public static void main(String[] args) throws Exception {
    //Recursividad
    int numeros[] = {1,2,3,4,5,6};
    int digito = 18;
    //System.out.println("Suma N enteros");
    //System.out.println(sumaNenteros(4));
    //System.out.println("El Factorial");
    //System.out.println(factorial(4));
    //System.out.println("Suma del Array");
    //System.out.println(sumaVector(numeros, 1, numeros.length));
    //La cantidad de vocales de una cadena.
    //System.out.println("Calcular potencia");
    //System.out.println(potencia(5, 3));
    //System.out.println("Digitos de numero");
    //System.out.println(digitosDeNumero(123456789));
    //String palabra = "Sé verlas al revés";
    //int posicion = palabra.length()-1;
    //System.out.println("Invetida ");
    //System.out.println(invertida(palabra, posicion));
    //System.out.println("String Builder");
    //String invertida = new StringBuilder(palabra).reverse().toString();
    //System.out.println(invertida);
    
    //System.out.println("Es palindroma");
    //System.out.println(esPalindromo(palabra));

    //Buscar un elemento en un array, devuelve la posicion en la que esta.
    System.out.println("Fibonacci");
    System.out.println(losConejosYFibonacci(1, 1, 0));


    } 

    public static int losConejosYFibonacci(int n, int conejos, int anterior){
        int suma;
        int total = 0;
        if(n == 10){
            return 2;
        }
        else{
            suma = conejos+anterior;
            anterior = conejos;
            conejos=suma;
            total = conejos+losConejosYFibonacci(n+1, conejos, anterior);
            return total;
        }
        
    }

    public static boolean esPalindromo(String cadena) {
		// Convertir a minúscula y quitar espacios " ", puntos "." y comas ","
		// También remplazar palabras con acento p.ej. í => i

		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		// Invertir la cadena, y si es igual que la original entonces
		// son palíndromos
		String invertida = new StringBuilder(cadena).reverse().toString();
		// Para invertir recomiendo ver
		// https://parzibyte.me/blog/2019/02/20/invertir-cadena-string-java/
		return invertida.equals(cadena);
	}

    public static String invertida(String palabra, int n){
        String lista="";
        char letra;
        if(n == 0){
            letra = palabra.charAt(n);
            lista += letra;
            return lista;
     }
        else{
            letra = palabra.charAt(n);
            lista = lista+letra+invertida(palabra, n-1);
            return lista;
        }
    }
    public static int digitosDeNumero(int numero){
        if (numero<=0)
            return 0;
        else 
        return 1+digitosDeNumero(numero/10);
    }

    public static int potencia(int b, int n){
        if (n==0){
            return 1;
        }
        if (n == 1) {
            return b;
        }
        
        return b*potencia(b, n-1);
    }
    public static int sumaVector(int numeros[], int li, int ls){
        
       if (li == ls){
        return numeros[li-1];
       }
       else {
        return numeros[li-1] + sumaVector(numeros, li+1, ls);
       }
    }
    static public long sumaNenteros(int n){
        if (n == 1) {
            return 1;
        }
        return n+sumaNenteros(n-1);
    }
//nota: el factorial de 0 es 1 :3
    static public long factorial(int n ){
        if (n<=1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
