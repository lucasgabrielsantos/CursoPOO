package cursoemvideo.aula04;

public class Carteira {
    private String modelo;
    private String cor;
    private float valor;
    private boolean temdinheiro;

    public Carteira(String m, String c, float v) {
        modelo = m;
        cor = c;
        valor = v;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void cheio() {
        this.temdinheiro = true;
    }

    public void vazio() {
        this.temdinheiro = false;
    }

    public void status() {
        System.out.println("SOBRE A CARTEIRA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Está com dinheiro? " + this.temdinheiro);
    }
}


