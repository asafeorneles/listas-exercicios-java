package Lista08_HerancaEpolimorfismo.Heranca.test;

import Lista08_HerancaEpolimorfismo.Heranca.dominio.*;

import java.util.Scanner;

public class IngressoTest03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = escolherIngresso(entrada);

        if (opcao == 1) {
            new Normal().imprime();
        } else {
            int opcaoVip = escolherVip(entrada);
            if (opcaoVip == 1) {
                new CamaroteInferior().imprime();
            } else {
                new CamaroteSuperior().imprime();
            }
        }
    }

    private static int escolherIngresso(Scanner entrada) {
        int opcao;
        do {
            System.out.println("Escolha seu ingresso (Digite 1 para Normal e 2 para VIP): ");
            opcao = entrada.nextInt();
            if (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 1 && opcao != 2);
        return opcao;
    }

    private static int escolherVip(Scanner entrada) {
        int opcao;
        do {
            System.out.println("Ingresso VIP selecionado!");
            System.out.println("Escolha a localização (Digite 1 para Inferior e 2 para Superior): ");
            opcao = entrada.nextInt();
            if (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 1 && opcao != 2);
        return opcao;
    }
}
