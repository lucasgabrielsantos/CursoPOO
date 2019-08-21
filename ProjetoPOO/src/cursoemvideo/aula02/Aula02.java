package cursoemvideo.aula02;

public class Aula02 {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("A Caneta é da fabricante " + this.modelo);
        System.out.println("É uma caneta da cor " + this.cor);
        System.out.println("Esta caneta tem a ponta de " + this.ponta);
        System.out.println("Ela está com a carga de " + this.carga);
        System.out.println("Está tampada ? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO!! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
