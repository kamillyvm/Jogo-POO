import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private String dificuldade;
    private List<Personagem> listaPersonagens;

    public Jogo(String dificuldade) {
        this.dificuldade = dificuldade;
        this.listaPersonagens = new ArrayList<>();
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void adicionarPersonagem(Personagem p) {
        listaPersonagens.add(p);
    }

    public void removerPersonagem(Personagem p) {
        listaPersonagens.remove(p);
    }
}
