package Lista08_HerancaEpolimorfismo.Heranca.test;
import Lista08_HerancaEpolimorfismo.Heranca.dominio.*;


import java.util.Scanner;

public class IngressoTest02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha seu ingresso (Digite 1 para Normal e 2 para Vip): ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                Normal normal = new Normal();
                normal.imprime();
            }
            else if (opcao == 2) {
                int opcao2;
                do {
                    System.out.println("Ingresso VIP selecionado!");
                    System.out.println("Escolha a localização (Digite 1 para Inferior e 2 para Superior): ");
                    opcao2 = entrada.nextInt();

                    if (opcao2 == 1) {
                        CamaroteInferior camaroteInferior = new CamaroteInferior();
                        camaroteInferior.imprime();
                    }
                    else if (opcao2 == 2) {
                        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
                        camaroteSuperior.imprime();
                    } else {
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                } while (opcao2 != 1 && opcao2 != 2);
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 1 && opcao != 2);

    }
}