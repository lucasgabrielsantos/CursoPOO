package cursoemvideo.aula12;

public class Mamifero extends Animal {

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("O Mamifero está correndo");

    }

    @Override
    public void alimentar() {
        System.out.println("O Mamifero está se alimentando ");

    }

    @Override
    public void emitirSom() {
        System.out.println("O mamifero está emitindo som de ajuda");

    }
}
