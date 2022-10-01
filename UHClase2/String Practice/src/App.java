import java.util.Scanner;

public class App {
    static int x, conteo = 0, i;
    static boolean estadia = true;
    static int opcion;
    static Scanner dato = new Scanner(System.in);
    static String nombres[] = new String[15], lista = "";
    static int nota[] = new int[15], id[] = new int[15];

    public static void main(String[] args) throws Exception {

        do {
            System.out.println(
                    "Selecciones alguna de las opciones. \n1. Ingresar Estudiante \n2. Ver Reporte de Estudiantes. \n3. Modificar Datos de Estudiante");
            opcion = dato.nextInt();

            switch (opcion) {
                case 1:
                    lista = "";
                    for (int x = 0; x < id.length; x++) {
                        id[x] = x + 1;
                        System.out.println("Ingresando informacion de estudiante: " + id[x]);
                        System.out.println("Ingrese el nombre del estudiante: ");
                        nombres[x] = dato.next();
                        System.out.println("Ingrese la nota del estudiante: ");
                        nota[x] = dato.nextInt();

                        System.out.println("Desea Continua? \n1. Si \n2. No");
                        opcion = dato.nextInt();
                        if (opcion == 2) {
                            break;
                        }
                        conteo++;
                    }
                    break;
                case 2:
                    System.out.println("Reporte de Estudiante");
                    System.out.println("-------------------------------------");
                    System.out.println("ID      NOMBRE     NOTA");
                    for (i = 0; i < conteo; i++) {
                        lista += id[i] + "      " + nombres[i] + "       " + nota[i] + "\n";
                    }
                    System.out.println(lista);
                    System.out.println("Final del reporte");
                    break;
                case 3:
                    for (i = 0; i < id.length; i++) {
                        id[i] = i + 1;
                        nombres[i] = "test";
                        nota[i] = 0;
                        conteo++;
                    }
                    break;
                default:
                    System.out.println("La opcion no existe. Intente de nuevo");
                    break;
            }

        } while (estadia);

    }
}
