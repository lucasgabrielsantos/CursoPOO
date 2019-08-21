package cursoemvideo.aula10e11.exercicio01;

public class Main {

    public static void main(String[] args) {

        Aluno p1 = new Aluno();
        Funcionario p2 = new Funcionario();
        Professor p3 = new Professor();
        Pessoa p4 = new Pessoa();

        p1.setNome("Lucas");
        p2.setNome("Gabriel");
        p3.setNome("Bruna");
        p4.setNome("Lais");

        p1.setIdade(21);
        p2.setIdade(22);
        p3.setIdade(22);
        p4.setIdade(23);

        p1.setCurso("Tecnologia");
        p2.setSetor("Desenvolvimento");
        p3.setEspecialidade("Psicologia");
        p3.setSalario(7500f);

        p1.setSexo("Masculino");
        p2.setSexo("Masculino");
        p3.setSexo("Feminino");
        p4.setSexo("Feminino");


        p3.setSalario(2500.75f);
        p3.receberAum(1000f);

        System.out.println("################################\n");
        System.out.println(p1.toString());
        System.out.println("################################\n");
        System.out.println(p2.toString());
        System.out.println("################################\n");
        System.out.println(p3.toString());
        System.out.println("################################\n");
        System.out.println(p4.toString());
        System.out.println("################################\n");

    }
}
