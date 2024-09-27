public class ContaDigital extends Conta {

    public ContaDigital(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void cobrarTaxaManutencao() {
        System.out.println("Conta Digital não possui taxa de manutenção.");
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Extrato Conta Digital. Saldo: " + saldo);
    }
}
