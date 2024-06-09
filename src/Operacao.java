/**
 * Operacao.java
 *
 * @author João Eduardo Montandon
 */
import java.util.Date;

/**
 * Classe responsável por registrar operações de saque e depósitos realizados em contas correntes.
 */
public abstract class Operacao {

    /* Data de realização da operação */
    private Date data;

    /* Tipo da operação */
    private char tipo;

    /* Valor da operação */
    private double valor;

    /* Quantidade de operações*/
    public static int totalOperacoes = 0;

    /**
     * Construtor. Inicializa uma nova instância da classe Operacao onde a data da operação é exatamente a data
     * da criação da classe.
     *
     * Exemplos de uso:
     *
     * > Operacao op1 = new Operacao('d', 2500); // Operação de depósito de 2500 reais
     * > Operacao op2 = new Operacao('s', 1000); // Operação de saque de 1000 reais
     *
     * @param tipo Tipo da operação, podendo ser 'd' ou 's'
     * @param valor Valor da operação
     */
    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();

        this.totalOperacoes++;
    }

    public void imprimirExtrato() {
        System.out.println(getTipo() + "\t" + getValor() + "\t" + getData());
    }

    //getters
    public Date getData(){
        return data;
    }

    public char getTipo(){
        return tipo;
    }

    public double getValor(){
        return valor;
    }

    //setters
    public void setTipo(char tipo) {
        if (tipo == 's' || tipo == 'd') {
            this.tipo = tipo;
        }
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
