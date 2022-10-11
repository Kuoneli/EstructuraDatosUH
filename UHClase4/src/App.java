import javax.naming.InitialContext;

public class App {
    public static void main(String[] args) throws Exception {
    //Recursividad

    //La cantidad de vocales de una cadena.




    //Buscar un elemento en un array, devuelve la posicion en la que esta.

    int numeros[] = {1,2,3,4,5,6};

    int resultado = indice(numeros, 0);

    System.out.println(resultado);

    } 

    public static int indice(int numeros[], int i){
        
        if(numeros[i]==6){
            return i;
        } else{
           i++;
            return  0 + indice(numeros, i+1);
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
