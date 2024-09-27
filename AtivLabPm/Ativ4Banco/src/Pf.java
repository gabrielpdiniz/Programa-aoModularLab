public class Pf extends Cliente {
    private String cpf;

    public Pf(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }

    @Override
    public void addConta(Conta conta) {
        super.addConta(conta);
        System.out.println("Conta adicionada para o cliente PF com CPF: " + cpf);
    }

}