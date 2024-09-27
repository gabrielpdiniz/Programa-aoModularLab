package Q4;

public class Partida {
    private Equipe equipe1;
    private Equipe equipe2;
    private int[] pontuacaoEquipe1;
    private int[] pontuacaoEquipe2;
    private static final int NUM_MAX_SETS = 5;
    private int[] vencedor;

    public Partida( Equipe e1, Equipe e2) {
        this.equipe1 = e1;
        this.equipe2 = e2;
        this.pontuacaoEquipe1 = new int[ NUM_MAX_SETS ];
        this.pontuacaoEquipe2 = new int[ NUM_MAX_SETS ];
        this.vencedor = new int[ NUM_MAX_SETS ];
    }

    public void setPontuacao( int nEquipe, int set, int pontuacao ) {
        if ( nEquipe == 1 )
            this.pontuacaoEquipe1[ set-1 ] = pontuacao;
        else if ( nEquipe == 2 )
            this.pontuacaoEquipe2[ set-1 ] = pontuacao;
    }

    public void imprimePlacar() {
        System.out.println("\n\t\t1\t2\t3\t4\t5\tFINAL");
        System.out.println( this.equipe1.getNome() + "\t" + this.pontuacaoEquipe1[ 0 ] + "\t" +this.pontuacaoEquipe1[ 1 ]+
         "\t" +this.pontuacaoEquipe1[ 2 ]+ "\t" +this.pontuacaoEquipe1[ 3 ]+ "\t" +this.pontuacaoEquipe1[ 4 ]);
        System.out.println( this.equipe2.getNome() + "\t" +this.pontuacaoEquipe2[ 0 ] + "\t" +this.pontuacaoEquipe2[ 1 ] +
        "\t" +this.pontuacaoEquipe2[ 2 ] + "\t" +this.pontuacaoEquipe2[ 3 ] + "\t" +this.pontuacaoEquipe2[ 4 ]);

    }

    private int calculaVencedorSet( int set ) {
        int pontuacaoVitoria = 25;
        if ( set == 5 )
            pontuacaoVitoria = 15;
        if ( set >= 1 && set <= 5 ) {
            if ( ( this.pontuacaoEquipe1[ set ] >= pontuacaoVitoria ) || ( this.pontuacaoEquipe2[ set ] >= pontuacaoVitoria ) ) {
                int dif = this.pontuacaoEquipe1[ set ] - this.pontuacaoEquipe2[ set ];
                if ( dif >= 2 ) {
                    
                    this.vencedor[ set ] = 1;
                    return 1;
                }
                else if ( dif <= -2 ) {
                    
                    this.vencedor[ set ] =  2;
                    return 2;
                }
            }
        }
        return 0;
    }

    public String getVencedorSet( int set ) {
        int nVencedor = this.calculaVencedorSet( set );
        if ( nVencedor == 1 )
            return this.equipe1.getNome();
        else if ( nVencedor == 2 )
            return this.equipe2.getNome();
        else
            return "-";
    }

}
