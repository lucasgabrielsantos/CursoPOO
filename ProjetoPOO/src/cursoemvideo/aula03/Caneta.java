package cursoemvideo.aula03;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("A Caneta é da fabricante " + this.modelo);
        System.out.println("É uma caneta da cor " + this.cor);
        System.out.println("Esta caneta tem a ponta de " + this.ponta);
        System.out.println("Ela está com a carga de " + this.carga);
        System.out.println("Está tampada ? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO!! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}


