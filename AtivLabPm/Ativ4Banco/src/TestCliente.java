import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCliente {
    
    @Test
    public void testAdicionarContaClientePF() {
        Pf clientePF = new Pf("João", "joao@gmail.com", "123.456.789-00");
        ContaCorrente contaCorrente = new ContaCorrente(1000.0, 500.0);
        clientePF.addConta(contaCorrente);
    }

    @Test
    public void testAdicionarContaClientePJ() {
        Pj clientePJ = new Pj("Empresa X", "empresa@gmail.com", "00.123.456/0001-00");
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0, 0.05);
        clientePJ.addConta(contaPoupanca);
    }
}
