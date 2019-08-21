package cursoemvideo.aula12;

public class Cachorro extends Mamifero {

    @Override
    public void locomover() {
        //super.locomover();
        System.out.println("O cachorro está correndo");
    }

    public void enterrarOsso(){
        System.out.println("O cachorro está enterrando osso");
    }
    public void abanarRabo(){
        System.out.println("O Cachorro está abanando o rabo");
    }
}
