package cursoemvideo.aula05e06;

public class Aula05 {
        public static void main(String[] args){
            Banco p1 = new Banco();
            p1.setNumConta(12345);
            p1.setTipo("CC");
            p1.setDono("Lucas");
            p1.abrirConta("CC" );

            p1.depositar(100);

            Banco p2 = new Banco();
            p2.setNumConta(67890);
            p2.setTipo("CP");
            p2.setDono("Gabriel");
            p2.abrirConta("CP");

            p2.depositar(500);
            p2.sacar(500);



            p1.estadoAtual();
            p2.estadoAtual();
        }
    }

