package cursoemvideo.aula09;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Lucas", 15, "Masculino");
        p[1] = new Pessoa("Gabriel", 22, "Masculino");

        l[0] = new Livro("POO", "Lucas", 400, p[0]);
        l[1] = new Livro("Orientação Objetos Avançado", "Gabriel", 500, p[1]);

        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
