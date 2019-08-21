package cursoemvideo.aula10e11.exercicio01;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazerAniver() {
        this.idade++;
    }

    @Override
    public String toString() {
        return "Pessoa \n" +
                "Nome " + this.getNome() + "\nIdade " + this.getIdade() + "\nsexo "
                + this.getSexo()  ;
    }
}
