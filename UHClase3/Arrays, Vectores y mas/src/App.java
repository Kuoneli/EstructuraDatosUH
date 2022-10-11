public class App {
    public static void main(String[] args) throws Exception {

    }

    public static void array1() {

        int[][] a = {
                { 1, -2, 3 },
                { -4, -5, 6, 9 },
                { 7 },
        };
        String lista = "";

        for (int i = 0; i < a.length; ++i) {
            lista = "";
            for (int j = 0; j < a[i].length; ++j) {
                lista += a[i][j] + " ";
            }
            System.out.println(lista);
        }
    }

}
