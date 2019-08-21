package cursoemvideo.aula10e11.exercicio02;

public class Main {
    public static void main(String[] args) {

//        Visitante v1 = new Visitante();
//
//        v1.setNome("Lucas");
//        v1.setIdade(22);
//        v1.setSexo("Masculino");
//
//        System.out.println(v1.toString());


        Aluno a1 = new Aluno();
        a1.setNome("Lucas Gabriel");
        a1.setMatricula(12342);
        a1.setCurso("Desenvolvimento Android Kotlin");
        a1.setIdade(23);
        a1.setSexo("Masculino");
        System.out.println(a1.toString());
        a1.PagarMensalidade();

        System.out.println("|---------------|\n");

        Bolsista b1 = new Bolsista();
        b1.setMatricula(123431);
        b1.setNome("Bruna");
        b1.setIdade(23);
        b1.setBolsa(15.0f);
        b1.setSexo("Feminino");
        System.out.println(b1.toString());
        b1.PagarMensalidade();



    }
}
