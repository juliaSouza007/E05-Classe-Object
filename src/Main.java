import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date data = new Date();

        PessoaFisica pF1 = new PessoaFisica("Julia", "rua das engracadinhas", data, "155.495.816-47", 16, 'F');
        PessoaFisica pF2 = new PessoaFisica("Mariana", "rua das princesas", data, "107.010.076-56", 16, 'F');
        PessoaJuridica pJ = new PessoaJuridica("CHURRASIC PARK", "rua dos dinossauros", data, "24 405 890/0001-86", "Alimenticio", 5);

        Conta contaPF1 = new Conta(pF1);
        Conta contaPF2 = new Conta(pF2);
        Conta contaPJ = new Conta(pJ);

        System.out.println("BANCO JMSZ _ IMPRIMINDO IMPORMACOES DOS CLIENTES");
        System.out.println("\nConta 1");
        pF1.imprimir();
        System.out.println("\nConta 2");
        pF2.imprimir();
        System.out.println("\nConta 3");
        pJ.imprimir();

        System.out.println("\n<<<REALIZANDO OPERACOES>>>");
        contaPF1.depositar(5000);
        contaPF2.depositar(2000);
        contaPJ.depositar(10000);

        contaPF1.sacar(200);
        contaPF2.sacar(1500);
        contaPJ.sacar(1640);

        System.out.println("\n<<IMPRIMINDO EXTRATO...>>");
        System.out.println("\nConta " +pF1.getNome());
        contaPF1.extrato();
        System.out.println("\nConta " +pF2.getNome());
        contaPF2.extrato();
        System.out.println("\nConta " +pJ.getNome());
        contaPJ.extrato();

        System.out.println("\nImprimindo a media...");
        int media = Operacao.totalOperacoes/Conta.totalContas;

        System.out.println("Media: " +media);
    }
}
