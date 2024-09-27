public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String t){
        this.tipo = t;
        this.status = true;
        if (t = "CC") {
            this.saldo = 50;
            
        }else{
            if (t = "CP") {
                this.saldo = 150;
                 }
        }
    }

    public void fecharConta(){
         if (saldo > 0) {
            System.out.println("Conta tem dinheiro");
            }if (saldo < 0) {
             System.out.println("Conta em debito");   
            } else {
            this.status = false;
            }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void depositar(float v){
        if (status = true) {
            setSaldo(getSaldo() + v);
            }else{
            System.out.println("Impossivel depositar");  
            }
    }

    public void sacar(float v){
        if (status = true) {
            if (saldo > v) {
                setSaldo(getSaldo() - v);
             } else {
                System.out.println("Saldo insuficiente");
            }
         } else {
            System.out.println("Impossivel sacar");
            
        }
    }

    public void pagarMensal(float v){
        if (tipo = "CC") {
            v = 12;
        } else {
        if (tipo = "CP") {
            v = 20;
        }
         }
        if (status = true) {
            if (saldo > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
        System.out.println("Impossivel pagar");
        }
    }

    

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }
}
