package cursoemvideo.aula02;

public class Aula02_1 {

    public static void main(String[] args) {

        Cadeira cad1 = new Cadeira();
        cad1.tipo = "Plástico";
        cad1.cor = "Preta";
        cad1.peso = 5;
        cad1.temgente();
        cad1.temninguem();
        cad1.status();
        cad1.sentar();

        Cadeira cad2 = new Cadeira();
        cad2.tipo = "Escritório";
        cad2.cor = "Cinza";
        cad2.peso = 6;
        cad2.temgente();
        cad2.status();
        cad2.sentar();

    }
}

