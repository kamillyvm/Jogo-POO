public class NaoJogavel extends Personagem {
    private boolean aliado;

    public NaoJogavel(String nome, int vitalidade, Jogo jogo, boolean aliado) {
        super(nome, vitalidade, jogo);
        this.aliado = aliado;
    }

    public boolean isAliado() {
        return aliado;
    }
    
    public void setAliado(boolean aliado) {
        this.aliado = aliado;
    }

    @Override
    public void aplicarGolpeEspecial(Personagem adversario) {
        String dificuldade = getJogo().getDificuldade();
        int dano = 0;

        switch(dificuldade.toLowerCase()) {
            case "easy": dano = 20;
                break;
            case "medium": dano = 30;
                break;
            case "hard": dano = 40;
                break;
        }

        adversario.setVitalidade(adversario.getVitalidade() - dano);
    }
}
