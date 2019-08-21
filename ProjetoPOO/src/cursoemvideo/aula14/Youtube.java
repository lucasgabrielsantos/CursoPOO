package cursoemvideo.aula14;

public class Youtube {
    public static void main(String[] args) {

        Video v[] = new Video[6];
        v[0] = new Video("Curso em Video POO ");
        v[1] = new Video("Aula 01 ");
        v[2] = new Video("Aula 02 ");
        v[3] = new Video("Aula 03 ");

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Lucas",22,"Masculino","123");
        g[1] = new Gafanhoto("Gabriel",20,"M","456");
        g[2] = new Gafanhoto("Bruna",23,"Feminino","789");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[1]);
        vis[1] = new Visualizacao(g[1],v[2]);
        vis[2] = new Visualizacao(g[2],v[2]);
        vis[3] = new Visualizacao(g[2],v[3]);



        System.out.println(vis[0].toString());
        vis[0].avaliar();
        System.out.println(vis[1].toString());
        vis[0].avaliarPor(80.0f);






//        System.out.println("VIDEOS\n------------------------------------------------------------------------------");
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());
//        System.out.println("\nGAFANHOTOS\n------------------------------------------------------------------------------");
//        System.out.println(g[0].toString());
//        System.out.println(g[1].toString());
//        System.out.println(g[2].toString());

    }
}
