package cursoemvideo.aula07e08;

public class Lutador {


    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private float peso;
    private String categoria;
    private int vitoria, derrota, empate;

    public Lutador(String nome, String nacionalidade, int idade, double altura,
                   float peso, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public void setVitoria(int vitoria) {
        this.setVitoria(getVitoria() + 1);
    }

    public void setDerrota(int derrota) {
        this.setDerrota(getDerrota() + 1);
    }

    public void setEmpate(int empate) {
        this.setEmpate(getEmpate() + 1);
    }

    public void apresentar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getAltura());
        System.out.println("Altura: " + getNome());
        System.out.println("Peso: " + getPeso() + "Kg");
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitorias: " + getVitoria() + " Vitórias");
        System.out.println("Derrotas: " + getDerrota() + " Derrotas");
        System.out.println("Empates: " + getEmpate() + " Empates");
    }

    public void status() {
        System.out.println(this.getNome() + " é um peso " + getCategoria());
        System.out.println("Ganhou " + this.getVitoria() + " Vezes");
        System.out.println("Perdeu " + this.getDerrota() + " Vezes");
        System.out.println("Empatou " + this.getEmpate() + " Vezes");
    }
}

