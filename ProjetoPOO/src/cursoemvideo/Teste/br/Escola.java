package cursoemvideo.Teste.br;

public class Escola {
    private String estudar;
    private boolean recreio;
    private int quantiaulas;

    public Escola(String estudar, boolean recreio, int quantiaulas) {
        this.estudar = estudar;
        this.quantiaulas = quantiaulas;
        this.recreio = recreio;
    }

    public int getQuantiaulaa() {
        return quantiaulas;
    }

    public String getEstudar() {
        return estudar;
    }

    public boolean getRecreio() {
        return recreio;
    }

    public void setRecreio(boolean recreio) {
        this.recreio = recreio;
    }

    public void setEstudar(String estudar) {
        this.estudar = estudar;
    }

    public void setQuantiaulas(int quantiaulas) {
        this.quantiaulas = quantiaulas;
    }
}

