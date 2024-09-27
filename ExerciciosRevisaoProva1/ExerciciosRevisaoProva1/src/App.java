import Q1.ContaBancaria;
import Q4.Equipe;
import Q4.Partida;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Questão 1");
        //ContaBancaria conta = new ContaBancaria( 111, "111", 200 );


         
        System.out.println("Questão 4");
        Equipe atletico = new Equipe("Atletico" );
        Equipe cruzeiro = new Equipe("Cruzeiro" );
       
        Partida p1 = new Partida( atletico, cruzeiro );
        p1.setPontuacao( 1, 1, 25 );
        p1.setPontuacao( 2, 1, 12 );
        p1.setPontuacao( 1, 2, 25 );
        p1.setPontuacao( 2, 2, 23 );

        System.out.println( p1.getVencedorSet(1) ) ;

        p1.imprimePlacar();
        
    }
}
