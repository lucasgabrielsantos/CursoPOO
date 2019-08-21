package cursoemvideo.aula10e11.exercicio01;

public class Professor extends Pessoa{

    private String especialidade;
    private float salario;


    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    public void receberAum(float aumento){
        this.salario = this.salario += aumento;
    }
}
