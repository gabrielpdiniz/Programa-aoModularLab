package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        // Exemplo de cadastro de pessoas
        try {
            Pessoa p = new Pessoa();
            p.setNome("LeBron");
            p.setAltura(1.95f);
            p.setPeso(90f);
            p.setDataNascimento(LocalDate.of(2005, 3, 25));
            p.setEstadoCivil(EstadoCivil.SOLTEIRO);
            p.setFormacaoAcademica(FormaçaoAcademica.MEDIA);
            p.setProfissao(Profissao.ESTUDANTE);
            p.setVidaSocial(true);
            p.setHobby(true);
            p.setAtividadeFisica(5);
            p.setSaude(8);

            pessoas.add(p);

            System.out.println("Cadastro foi feito com sucesso!");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro");
        }
    }
}
