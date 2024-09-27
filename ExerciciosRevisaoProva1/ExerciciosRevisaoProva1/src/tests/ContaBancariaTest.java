package tests;

import Q1.ContaBancaria;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ContaBancariaTest {
    private ContaBancaria conta;

    @Before
    public void criaConta() {
        this.conta = new ContaBancaria( 1, "123456", 100 );  
    }

    @Test
    public void criaContaBancaria() {
        //ContaBancaria conta = new ContaBancaria( 1, "123456", 100 );        
        Assert.assertNotNull( conta );
    }

    @Test
    public void depositoTest() {
        ContaBancaria conta = new ContaBancaria( 1, "123456", 100 );   
        conta.deposito(200);
        Assert.assertEquals( 200, conta.getSaldo(), 0 );
    }

    @Test
    public void depositoComJurosTest() {
        ContaBancaria conta = new ContaBancaria( 1, "123456", 100 );   
        conta.deposito(200);
        conta.saque(300);
        conta.deposito(200);
        Assert.assertEquals( 97, conta.getSaldo(), 0 );
    }

    @Test
    public void saqueTrueTest() {
        ContaBancaria conta = new ContaBancaria( 1, "123456", 100 );   
        conta.deposito(200);        
        Assert.assertTrue( conta.saque(100) );
    }

    @Test
    public void saqueFalseTest() {
        ContaBancaria conta = new ContaBancaria( 1, "123456", 100 );   
        conta.deposito(200);        
        Assert.assertFalse( conta.saque(301) );
    }

    @Test
    public void saqueComLimiteTest() {
        ContaBancaria conta = new ContaBancaria( 1, "123456", 100 );   
        conta.deposito(200);        
        Assert.assertTrue( conta.saque(300) );
    }



}
