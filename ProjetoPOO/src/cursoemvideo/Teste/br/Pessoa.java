package cursoemvideo.Teste.br;

public class Pessoa {
    private String nome;
    private String nascimento;
    private int idade;
    private String sexo;

    public Pessoa(String novoNome, String novoNascimento, int novaIdade, String novoSexo) {
        this.nome = novoNome;
        this.nascimento = novoNascimento;
        this.idade = novaIdade;
        this.sexo = novoSexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

