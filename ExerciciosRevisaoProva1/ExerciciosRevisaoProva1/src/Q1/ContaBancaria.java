package Q1;

import java.time.LocalDate;

public class ContaBancaria {
    private int numero;
    private String cpf;
    private double saldo;
    private double limite = 100;
    private static double taxaJuros = 0.03;
    //private LocalDate dtAberturaConta;

    public ContaBancaria( int numero, String cpf, double limite ) {
        this.numero = numero;
        this.cpf = cpf;
        this.limite = limite;
        //this.dtAberturaConta = LocalDate.of(2024, 9, 3);  // Ano, mês, dia
        //System.out.println( this.dtAberturaConta );
    }

    public boolean saque( double valor ) {
        double saldoDisponivel = this.saldo + this.limite;
        if ( valor <= saldoDisponivel ) {
            this.saldo -= valor;
            System.out.println( "Saque realizado com sucesso! " );
            System.out.println( "Saldo atual: R$ "  + this.saldo );
            return true;
        }
        else {
            System.out.println( "Saldo insuficiente! " );
            return false;
        }
    }

    public void deposito( double valor ) {
        double valorUtilizadoLimite = 0;
        if ( this.saldo < 0 ) {
            valorUtilizadoLimite = -1 * this.saldo;
        }
        this.saldo += valor - ( valorUtilizadoLimite * ContaBancaria.taxaJuros );
    }

    public double getSaldo() {
        return this.saldo;
    }
}
