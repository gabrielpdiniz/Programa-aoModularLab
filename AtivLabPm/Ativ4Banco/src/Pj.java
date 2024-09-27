public class Pj extends Cliente {
    private String cnpj;

    public Pj(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    public void addResponsavel(Pf responsavel) {
        System.out.println("Responsável " + responsavel.getNome() + " adicionado para a empresa com CNPJ: " + cnpj);
    }

    @Override
    public void addConta(Conta conta) {
        super.addConta(conta);
        System.out.println("Conta adicionada para o cliente PJ com CNPJ: " + cnpj);
    }
}
