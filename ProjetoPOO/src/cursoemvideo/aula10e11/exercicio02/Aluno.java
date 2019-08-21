package cursoemvideo.aula10e11.exercicio02;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;


    public String getCurso() {
        return curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void PagarMensalidade() {

        System.out.println("Pagando Mensalidade do Aluno " + this.getNome());

    }
}
