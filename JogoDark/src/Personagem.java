public abstract class Personagem {
    private String nome;
    private int vitalidade;
    private Jogo jogo;

    public Personagem(String nome, int vitalidade, Jogo jogo){
        this.nome = nome;
        this.jogo = jogo;

        if(vitalidade >= 0 && vitalidade <= 100){
            this.vitalidade = vitalidade;
        }else if(vitalidade < 0){
            this.vitalidade = 0;
        }else if(vitalidade > 100){
            this.vitalidade = 100;
        }
    }

    public String getNome(){
        return nome;
    }

    public int getVitalidade(){
        return vitalidade;
    }

    public void setVitalidade(int vitalidade){
        if(vitalidade >= 0 && vitalidade <= 100){
            this.vitalidade = vitalidade;
        }else if(vitalidade < 0){
            this.vitalidade = 0;
        }else if(vitalidade > 100){
            this.vitalidade = 100;
        }
    }

    public Jogo getJogo(){
        return jogo;
    }

    public void aplicarGolpeNormal(Personagem adversario){
        adversario.setVitalidade(adversario.getVitalidade() - 10);
    }

    public abstract void aplicarGolpeEspecial(Personagem adversario);

}