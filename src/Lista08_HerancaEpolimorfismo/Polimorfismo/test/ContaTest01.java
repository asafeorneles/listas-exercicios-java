package Lista08_HerancaEpolimorfismo.Polimorfismo.test;

import Lista08_HerancaEpolimorfismo.Polimorfismo.dominio.Conta;
import Lista08_HerancaEpolimorfismo.Polimorfismo.dominio.ContaCorrente;
import Lista08_HerancaEpolimorfismo.Polimorfismo.dominio.ContaPoupanca;
import Lista08_HerancaEpolimorfismo.Polimorfismo.servico.RelatorioDeConsulta;

import java.util.Scanner;

public class ContaTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Conta contaCorrente = new ContaCorrente(1, "Naruto", 1500, false, 2500);
        Conta contaPoupanca = new ContaPoupanca(1, "Naruto", 1000, false, 13);
        int opcao;
        int opcaoCorrente;
        int opcaoPoupanca;

        do {
            System.out.println("### MENU DO BANCO ###");
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupanca");
            System.out.println("3 - Sair");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                do {
                    System.out.println("1 - Realizar depósito");
                    System.out.println("2 - Realizar saque");
                    System.out.println("3 - Consultar estado da conta");
                    System.out.println("4 - Voltar");
                    System.out.println("5 - Sair");
                    opcaoCorrente = entrada.nextInt();

                    switch (opcaoCorrente) {
                        case 1: realizarDeposito(contaCorrente, entrada); break;
                        case 2: realizarSaque(contaCorrente, entrada); break;
                        case 3: RelatorioDeConsulta.relatorioConsulta(contaCorrente); break;
                        case 5: System.out.println("Saindo..."); break;
                    }
                }
                while (opcaoCorrente != 4);

            }
            else if (opcao == 2) {
                do {
                    System.out.println("1 - Realizar depósito");
                    System.out.println("2 - Realizar saque");
                    System.out.println("3 - Consultar estado da conta");
                    System.out.println("4 - Voltar");
                    System.out.println("5 - Sair");
                    opcaoPoupanca = entrada.nextInt();

                    switch (opcaoPoupanca) {
                        case 1: realizarDeposito(contaPoupanca, entrada); break;
                        case 2: realizarSaque(contaPoupanca, entrada); break;
                        case 3: RelatorioDeConsulta.relatorioConsulta(contaPoupanca); break;
                        case 5: System.out.println("Saindo..."); break;
                    }

                }
                while (opcaoPoupanca != 4);

            }
            else if (opcao == 3) {
                System.out.println("Saindo do Sistema...");
                break;
            }
        }
        while(opcao != 3);


    }

    public static void realizarDeposito(Conta conta, Scanner entrada) {
        System.out.println("Valor do deposito: ");
        double valor = entrada.nextDouble();
        conta.deposito(valor);
    }

    public static void realizarSaque(Conta conta, Scanner entrada) {
        System.out.println("Valor do saque: ");
        double valor = entrada.nextDouble();
        conta.retirada(valor);
    }
}
