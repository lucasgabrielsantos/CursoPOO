package cursoemvideo.aula10e11.exercicio02;

public class Bolsista extends Aluno {

    private float bolsa;

    public void RenovarBolsa() {
        System.out.println("Renovando Bolsa de " + this.getNome());
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void PagarMensalidade() {
        super.PagarMensalidade();
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }
}
