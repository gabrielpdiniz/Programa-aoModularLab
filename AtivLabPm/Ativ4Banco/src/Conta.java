public abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public abstract void gerarExtrato();
    public abstract void cobrarTaxaManutencao();
}
