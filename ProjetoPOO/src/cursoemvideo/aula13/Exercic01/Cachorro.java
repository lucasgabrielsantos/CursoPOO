package cursoemvideo.aula13.Exercic01;

public class Cachorro {

    public void reagir(String frase) {

        if (frase == "Toma comida") {
            frase = "Olá";
            System.out.println("Sem vergonha");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int min, int hora) {
        if (hora < 12) {
            System.out.println("Está feliz em me ver");
        } else if (hora >= 18) System.out.println("Ignorar");
        else System.out.println("Abanar e latir");
    }

    public void reagir(boolean dono) {
        if (dono = true) {
            System.out.println("Sou dono desse vira lata");
        } else {
            System.out.println("Ele vai me morder!!!!!!!!!");
        }
    }

    public void reagir(int idade, float peso) {

        if (idade < 5)
            if (peso < 10)
                System.out.println("Abanar");
            else
                System.out.println("latir");
        if (peso < 10)
            System.out.println("Rosnar");
        else
            System.out.println("Ignorar");
    }
}
