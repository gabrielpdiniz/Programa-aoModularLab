package test;

import business.LocalDate;

public class PessoaTest {
    public static void main(String[] args) {
        try {
            Pessoa p = new Pessoa();
            p.setNome("Gabriel Oliveira");
            p.setAltura(1.95f);
            p.setPeso(90f);
            p.setDataNascimento(LocalDate.of(2001, 3, 23));
            p.setEstadoCivil(EstadoCivil.CASADO);
            p.setFormacaoAcademica(FormaçaoAcademica.SUPERIOR);
            p.setProfissao(Profissao.CLT);
            p.setVidaSocial(true);
            p.setHobby(false);
            p.setAtividadeFisica(4);
            p.setSaude(9);

            System.out.println("Pessoa cadastrada com sucesso.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
