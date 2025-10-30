public class Jogavel extends Personagem implements Controle {
    private int nivel; //1 a 5

    public Jogavel(String nome, int vitalidade, Jogo jogo, int nivel) {
        super(nome, vitalidade, jogo);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void aplicarGolpeEspecial(Personagem adversario) {
        int dano = 10 * nivel;
        adversario.setVitalidade(adversario.getVitalidade() - dano);
    }

    //controle dos botões
    @Override
    public void botaoA(Personagem adversario) {
        aplicarGolpeNormal(adversario);
    }

    @Override
    public void botaoB(Personagem adversario) {
        aplicarGolpeEspecial(adversario);
    }
}
