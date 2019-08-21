package cursoemvideo.aula14;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }


    @Override
    public String toString() {
        return "Visualizacao | Espectador: " + this.espectador + ", Filme: " + this.filme;
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);

    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliarPor(float por) {
        int tot = 0;
        if (por <= 20) {
            tot = 3;
        } else if (por <= 50) {
            tot = 5;
        } else if (por <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);

    }
}
