import java.util.Arrays;

public class Conta {
    private Cliente donoConta;
    private Operacao[] operacoes = new Operacao[1000];

    private double saldo = 15000;

    public static int totalContas = 0;

    private int contador = 0;
    
    private double limite;
    
    private int num;

    public Conta (Cliente donoConta, double limite, double saldo, int num) {
        this.num = num;
        this.saldo = saldo;
        this.limite = limite;
        this.donoConta = donoConta;
        totalContas++;
    }

    boolean depositar (double valor) {
        if (valor > 0.0) {
            this.saldo += valor;
            OperacaoDeposito Dep = new OperacaoDeposito(valor);
            operacoes[contador] = Dep;
            contador++;
            return true;
        } else {
            return false;
        }
    }

    boolean sacar (double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            OperacaoSaque Saq = new OperacaoSaque(valor);
            operacoes[contador] = Saq;
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public void extrato(){
        for(int i = 0; i < contador; i++){
           operacoes[i].imprimirExtrato();
        }
    }

     public String toString() {
        String str = "<< Conta " + this.num + " >>\n" +
                      this.donoConta.toString() + "\n" +
                     "Saldo: " + this.saldo + "\n" +
                     "Limite: " + this.limite + "\n" +
                     "\n";
        return str;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Conta) {
            Conta objConta = (Conta) obj;

            if(this.num == objConta.num) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //getters
    public double getSaldo() {
        return saldo;
    }

    public Cliente getDonoConta(){
        return this.donoConta;
    }

    public Operacao[] getOperacoes(){
        return this.operacoes;
    }

    //setters
    public void setDonoConta(Cliente donoConta) {
        this.donoConta = donoConta;
    }
    
    public boolean setLimite(double limite) {
        if (limite < 0) {
            this.limite = 0;
            return false;
        } else {
            this.limite = limite;
            return true;
        }
    }

}
