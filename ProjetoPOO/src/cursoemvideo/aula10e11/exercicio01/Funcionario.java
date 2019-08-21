package cursoemvideo.aula10e11.exercicio01;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }
}

