package cursoemvideo.aula07e08;

public class Principal {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[4];

        l[0] = new Lutador("Lucas", "Brasileiro", 22, 1.84, 71,
                15, 3, 0);
        l[1] = new Lutador("Gabriel", "Americano", 32, 2.02, 73,
                20, 2, 0);
        l[2] = new Lutador("Dos", "Argentino", 29, 1.89, 120.8f,
                17, 2, 1);
        l[3] = new Lutador("Santos", "Mexicano", 20, 1.74, 120.4f,
                11, 10, 3);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
    }
}

