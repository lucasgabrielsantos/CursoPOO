package cursoemvideo.aula10e11.exercicio01;

public class Aluno extends Pessoa {

    private float matri;
    private String curso;


    public float getMatri() {
        return matri;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatri(float matri) {
        this.matri = matri;
    }

    public void cancelarMatr(){
        System.out.println("Matricula será cancelada");

    }

}
