package cursoemvideo.aula13.exercici02;

public class Main {

    public static void main(String[] args) {

        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        l.emitirSom();
        c.emitirSom();
        c.reagir("Oi");
    }
}
