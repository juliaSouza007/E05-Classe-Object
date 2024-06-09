import java.util.Date;

public class PessoaFisica extends Cliente {
    private String cpf;
    private int idade;
    private char sexo;

    public PessoaFisica(String nome, String endereco, Date data, String cpf, int idade, char sexo) {
        super(nome, endereco, data);
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Data de Cadastro: " + getData());
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }

    //setters
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    //getters
    public String getCpf(){
        return cpf;
    }

    public int getIdade(){
        return idade;
    }

    public char getSexo(){
        return sexo;
    }
}
