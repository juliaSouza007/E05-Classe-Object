import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date data = new Date();

        PessoaFisica pF1 = new PessoaFisica("Julia", "rua das engracadinhas", data, "155.495.816-47", 16, 'F');
        PessoaFisica pF2 = new PessoaFisica("Mariana", "rua das princesas", data, "107.010.076-56", 16, 'F');
        PessoaJuridica pJ = new PessoaJuridica("CHURRASIC PARK", "rua dos dinossauros", data, "24 405 890/0001-86", "Alimenticio", 5);

        Conta contaPF1 = new Conta(pF1, 100000, 80000, 0);
        Conta contaPF2 = new Conta(pF2, 50000, 10000, 1);
        Conta contaPJ = new Conta(pJ, 500000, 100000, 2);

        System.out.println("<< BANCO JMSZ >>\n<< IMPRIMINDO INFORMACOES DOS CLIENTES >>");
        System.out.println("\n<< Conta " + pF1.getNome() + " >>");
            System.out.println(contaPF1.toString());
        System.out.println("\n<< Conta " + pF2.getNome() + " >>");
            System.out.println(contaPF2.toString());
        System.out.println("\n<< Conta " + pJ.getNome() + " >>");
            System.out.println(contaPJ.toString());

        System.out.println("\n<< REALIZANDO OPERACOES >>");
        contaPF1.depositar(5000);
        contaPF2.depositar(2000);
        contaPJ.depositar(10000);

        contaPF1.sacar(200);
        contaPF2.sacar(1500);
        contaPJ.sacar(1640);

        System.out.println("\n<< IMPRIMINDO EXTRATO... >>");
        System.out.println("\nConta: " +pF1.getNome());
        contaPF1.extrato();
        System.out.println("\nConta: " +pF2.getNome());
        contaPF2.extrato();
        System.out.println("\nConta: " +pJ.getNome());
        contaPJ.extrato();

        System.out.println("\nImprimindo a media...");
        int media = Operacao.totalOperacoes/Conta.totalContas;

        System.out.println("Media: " +media);
        
        //verificacao pelo metodo equals
        System.out.println("\nConta " + pF1.getNome() + " equals (igual) Conta " + pF2.getNome() + "? ");
        System.out.println(pF1.equals(pF2));
    }
}
