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

   
    public String toString() {
        String str = "<< PESSOA FISICA >>\n" +
                     "Nome: " + this.getNome() + "\n" +
                     "CPF:" + cpf + "\n" +
                     "Idade:" + idade + "\n" +
                     "Genero:" + genero + "\n" +
                     "Data: " + this.getData() + "\n" +
                     "Endereco: " + this.getEndereco() + "\n" +
                     "\n";
        return str;
    }

    public boolean equals(Object obj) {
        if(obj instanceof PessoaFisica) {
            PessoaFisica objPF = (PessoaFisica) obj;

            if(this.cpf.equals(objPF.cpf)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
