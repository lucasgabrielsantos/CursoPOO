package cursoemvideo.aula07e08;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiante) {
        this.desafiado = desafiante;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public float getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2) {
            this.aprovada = true;
            desafiado = l1;
            desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("\n### DESAFIADO ###\n");
            this.desafiado.apresentar();
            System.out.println("\n### DESAFIANTE ###\n");
            this.desafiante.apresentar();

            Random aleatório = new Random();
            int vencedor = aleatório.nextInt(3);
            System.out.println("\n|||||||||||| RESULTADOO FINALLLLLLLL ||||||||||||\n");
            switch (vencedor) {
                case 0:
                    System.out.println("\nEmpatou a luta.\n");
                    this.desafiado.getEmpate();
                    this.desafiante.getEmpate();
                    break;
                case 1:
                    System.out.println("\nVENCEUUU " + this.desafiado.getNome());
                    this.desafiado.getVitoria();
                    this.desafiante.getDerrota();
                    break;
                case 2:
                    System.out.println("\nVENCEUUU " + this.desafiante.getNome());
                    this.desafiante.getVitoria();
                    this.desafiado.getDerrota();
                    break;
            }
        } else {
            System.out.println("A Luta não pode acontecer..");
            this.desafiado.apresentar();


        }
    }
}