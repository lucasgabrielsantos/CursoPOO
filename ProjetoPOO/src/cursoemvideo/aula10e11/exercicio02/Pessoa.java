package cursoemvideo.aula10e11.exercicio02;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "\nDados\n" + "|||||||||||||||\n" +
                "Nome: " + nome +
                "\nIdade: " + idade +
                "\nSexo: " + sexo;}

    public void fazerAniver() {
        this.idade++;



    }
}
