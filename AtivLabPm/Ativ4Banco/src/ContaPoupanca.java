public class ContaPoupanca extends Conta {
    private double taxaMensal = 10.0;
    private double taxaRendimento;

    public ContaPoupanca(double saldoInicial, double taxaRendimento) {
        super(saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void cobrarTaxaManutencao() {
        saldo -= taxaMensal;
        System.out.println("Taxa de manutenção cobrada: " + taxaMensal);
    }

    public void creditarRendimento() {
        saldo += saldo * taxaRendimento;
        System.out.println("Rendimento creditado: " + (saldo * taxaRendimento));
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Extrato Conta Poupança. Saldo: " + saldo);
    }
}
