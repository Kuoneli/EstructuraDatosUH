public class PilaEstudiantes {
    private static final int TAMPILA = 10;
    public int cima;
    private String [] estudiantes;

    public PilaEstudiantes(){
        cima = -1;
        estudiantes = new String[TAMPILA];
    }

    public boolean pilaLlena(){
        return cima == TAMPILA -1;
    }
    public void insertar(String estudiante) throws Exception{
        if (pilaLlena()) {
            throw new Exception ("Desbordamiento Pila");
        }
        cima++;
        estudiantes[cima] = estudiante;
    }

    public void limpiarPila(){
        cima = -1;
    }

    public boolean pilaVacia(){
        return cima == -1;
    }

    public String quitarNota()throws Exception{
        String removida;
        if (pilaVacia()) {
            throw new Exception("Pila vacia, no se puede extraer.");
        }
        removida = estudiantes[cima];
        cima--;
        return removida;
    }
    
}
