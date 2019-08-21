package cursoemvideo.aula02;

public class Cadeira {
    String cor;
    String tipo;
    int peso;
    boolean ocupada;

    void status() {
        System.out.println("Esta Cadeira é da cor " + this.cor);
        System.out.println("Ela é do tipo de " + this.tipo);
        System.out.println("Ela tem o peso de " + this.peso);
        System.out.println("Está ocupada? " + this.ocupada);
    }

    void sentar() {
        if (this.ocupada == true) {
            System.out.println("procure outra cadeira para sentar-se");
        } else {
            System.out.println("Ela está vazia, sente-se");
        }
    }

    void temninguem() {
        this.ocupada = false;
    }

    void temgente() {
        this.ocupada = true;
    }
}


