public class EstudianteyNota {
    private int nota;
    private String name;

    EstudianteyNota(int nota, String name){
        this.nota = nota;
        this.name = name;

    }

    public void display(){
        System.out.println("Nombre: " + name + "\n Nota: "+ nota);
    }
}
