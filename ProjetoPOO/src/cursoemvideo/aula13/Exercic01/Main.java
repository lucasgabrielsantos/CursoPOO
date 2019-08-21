package cursoemvideo.aula13.Exercic01;

import cursoemvideo.aula13.Exercic01.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro();

        c1.reagir("Oi");
        c1.reagir(true);
        c1.reagir(12, 8);
        c1.reagir(2, 12.2f);
    }
}
