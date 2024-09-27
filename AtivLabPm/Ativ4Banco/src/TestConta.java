import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestConta {

    @Test
    public void testContaCorrente() {
        ContaCorrente contaCorrente = new ContaCorrente(1000.0, 500.0);
        contaCorrente.cobrarTaxaManutencao();
        contaCorrente.gerarExtrato();
        assertEquals(980.0, contaCorrente.saldo);
    }

    @Test
    public void testContaPoupanca() {
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0, 0.05);
        contaPoupanca.cobrarTaxaManutencao();
        contaPoupanca.creditarRendimento();
        contaPoupanca.gerarExtrato();
        assertEquals(2090.0, contaPoupanca.saldo, 0.01);
    }

    @Test
    public void testContaDigital() {
        ContaDigital contaDigital = new ContaDigital(1500.0);
        contaDigital.cobrarTaxaManutencao();
        contaDigital.gerarExtrato();
        assertEquals(1500.0, contaDigital.saldo);
    }
}
