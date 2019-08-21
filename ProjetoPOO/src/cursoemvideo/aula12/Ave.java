package cursoemvideo.aula12;

public class Ave extends Animal{

    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Ave está voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave está se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ave está fazendo som de ajuda");

    }
}
