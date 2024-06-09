import java.util.Date;
import java.util.Enumeration;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String setor;
    private int numFuncionarios;

    public PessoaJuridica(String nome, String endereco, Date data, String cnpj, String setor, int numFuncionarios) {
        super(nome, endereco, data);
        this.cnpj = cnpj;
        this.setor = setor;
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + cnpj);
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Data de cadastro: " + getData());
        System.out.println("Setor: " + setor);
        System.out.println("Numero de Funcionarios: " + numFuncionarios);
    }

    //setters
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public void setNumFuncionarios(int numFuncionarios){
        this.numFuncionarios = numFuncionarios;
    }

    //getters
    public String getCnpj(){
        return cnpj;
    }

    public String getSetor(){
        return setor;
    }

    public int getNumFuncionarios(){
        return numFuncionarios;
    }

}
