public class Principal {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Medium");

        Jogavel p1 = new Jogavel("Paulo", 100, jogo, 3);
        NaoJogavel p2 = new NaoJogavel("Luisa", 100, jogo, false);

        jogo.adicionarPersonagem(p1);
        jogo.adicionarPersonagem(p2);

        //teste 1
        p1.botaoA(p2);
        p1.botaoA(p2);
        p1.botaoB(p2);

        System.out.println("final do personagem nao jogavel: " + p2.getVitalidade());

        //teste 2
        p2.aplicarGolpeEspecial(p1);
        p2.aplicarGolpeNormal(p1);

        System.out.println("final do personagem jogavel: " + p1.getVitalidade());
    }
}
