package cursoemvideo.aula12;

public class Principal {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Cachorro k = new Cachorro();
        Canguru c = new Canguru();

        Peixe p = new Peixe();
        Cobra co = new Cobra();

        GoldFish g = new GoldFish();

        Reptil r = new Reptil();


        Ave a = new Ave();

        //Mae mamifero
        m.setPeso(14);
        m.idade = 2;
        m.setMembros(5);
        m.alimentar();
        System.out.println(m.toString());
        System.out.println("\n===================\n");
        c.setPeso(10); //filhos
        c.setIdade(7);
        c.locomover();
        c.usarBolsa();
        System.out.println(c.toString());
        System.out.println("\n===================\n");
        k.setPeso(23);
        k.setIdade(14);
        k.abanarRabo();
        k.enterrarOsso();
        System.out.println(k.toString());
        System.out.println("\n===================\n");



        // Mãe Peixe
        p.peso = 10;
        p.setIdade(4);
        p.locomover();
        p.alimentar();
        System.out.println(p.toString());
        System.out.println("\n===================\n");
        g.setIdade(1);      //filhos
        g.setPeso(1);
        g.locomover();
        g.emitirSom();
        System.out.println(g.toString());
        System.out.println("\n===================\n");




        // Mae Reptil
        r.setIdade(50);
        r.peso = 1000;
        r.setMembros(7);
        r.emitirSom();
        System.out.println(r.toString());
        System.out.println("\n===================\n");
        co.setIdade(11);      //filhos
        co.setPeso(13);
        co.locomover();
        co.emitirSom();
        System.out.println(c.toString());
        System.out.println("\n===================\n");




        // Mae Ave
        a.setMembros(15);
        a.setPeso(2);
        a.setIdade(4);
        a.emitirSom();
        System.out.println(a.toString());
    }

}
