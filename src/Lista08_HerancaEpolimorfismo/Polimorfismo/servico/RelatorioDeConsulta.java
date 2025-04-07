package Lista08_HerancaEpolimorfismo.Polimorfismo.servico;

import Lista08_HerancaEpolimorfismo.Polimorfismo.dominio.Conta;
import Lista08_HerancaEpolimorfismo.Polimorfismo.dominio.ContaCorrente;
import Lista08_HerancaEpolimorfismo.Polimorfismo.dominio.ContaPoupanca;

public class RelatorioDeConsulta {
    public static void relatorioConsulta(Conta conta) {
        if (conta.isCancelada()) return;
        System.out.println("Relatorio de consulta");
        conta.imprime();
        System.out.println("Titulo: "  + conta.getTitulo());
        System.out.println("Numero da conta: "  + conta.getNumero());
        System.out.println("Saldo: "  + conta.getSaldo());

        if (conta instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("Limite especial: " + cc.getLimiteEspecial());
            System.out.println("Total disponivel: " + cc.getTotalDisponivel());

        } else if (conta instanceof ContaPoupanca) {
            ContaPoupanca cp = (ContaPoupanca) conta;
            double saldoAniversario = cp.getSaldo() + (cp.getSaldo() * ContaPoupanca.TAXA_REMUNERACAO);

            System.out.println("Taxa de remuneracao: " + ContaPoupanca.TAXA_REMUNERACAO);
            System.out.println("Saldo no dia do aniversario: " + saldoAniversario);
        }

    }
}
