package cursoemvideo.aula12;

public class Canguru extends Mamifero {

    @Override
    public void locomover() {
        //super.locomover();
        System.out.println("O Canguru está saltando");
    }

    public void usarBolsa(){
        System.out.println("O Canguru está usando bolsa");
    }
}
