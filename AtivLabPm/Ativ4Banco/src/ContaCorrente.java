public class ContaCorrente extends Conta {
    private double limite;
    private double taxaJuros = 0.07;
    private double taxaMensal = 20.0;

    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    @Override
    public void cobrarTaxaManutencao() {
        saldo -= taxaMensal;
        System.out.println("Taxa de manutenção cobrada: " + taxaMensal);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Extrato Conta Corrente. Saldo: " + saldo + ", Limite: " + limite);
    }
}
