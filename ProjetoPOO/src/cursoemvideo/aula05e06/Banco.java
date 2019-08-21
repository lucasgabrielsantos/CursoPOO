package cursoemvideo.aula05e06;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo de: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());

    }

    public Banco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n) {
        numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String d) {
        dono = d;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(float s) {
        saldo = s;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean s) {
        status = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0 ){
            System.out.println("Conta com dinheiro");
        }else if (this.getSaldo() < 0 ){
            System.out.println("Conta com débito, impossível sacar");
        }else setStatus(false);
        System.out.println("Conta fechada com sucesso..");
    }

    public void depositar(float v) {
        if (this.getStatus()) { //true
            setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    public void sacar(float v){

        if (this.getStatus());
        if (this.getSaldo() >= v ) {this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado na conta de " + this.getDono());
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    }

    public void pagarMensal(float v) {
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (getTipo() == "CP")
            v = 20;
        if (this.getStatus()) {  //true
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada..");
        }
    }
}



