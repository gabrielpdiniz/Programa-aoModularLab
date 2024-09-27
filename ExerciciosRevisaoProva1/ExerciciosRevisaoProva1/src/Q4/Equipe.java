package Q4;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<>();

    public Equipe ( String nome ) {
        this.nome = nome;
    }

    public void addJogador( Jogador j ) {
        this.jogadores.add( j );
    }

    public String getNome() {
        return this.nome;
    }

    public void imprimeListaJogadores() {
        
    }


}
