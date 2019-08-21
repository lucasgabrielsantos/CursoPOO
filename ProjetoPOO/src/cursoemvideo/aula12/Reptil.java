package cursoemvideo.aula12;

public class Reptil extends Animal {

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("O Reptil está correndo");

    }

    @Override
    public void alimentar() {
        System.out.println("O Reptil está se alimentando");

    }

    @Override
    public void emitirSom() {
        System.out.println("O Reptil está emitindo som de ajuda");

    }
}
