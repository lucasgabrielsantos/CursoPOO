package cursoemvideo.aula12;

public class Peixe extends Animal {

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Peixe está nadando");

    }

    @Override
    public void alimentar() {
        System.out.println("Peixe está se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
}
