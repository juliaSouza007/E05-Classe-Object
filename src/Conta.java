
import java.util.Arrays;

public class Conta {
    private Cliente donoConta;
    private Operacao[] operacoes = new Operacao[1000];

    private double saldo = 15000;

    public static int totalContas = 0;

    private int contador = 0;

    public Conta (Cliente donoConta) {
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

}
