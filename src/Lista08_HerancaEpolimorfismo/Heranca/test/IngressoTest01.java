package Lista08_HerancaEpolimorfismo.Heranca.test;

import Lista08_HerancaEpolimorfismo.Heranca.dominio.*;

import java.util.Scanner;

public class IngressoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha seu ingresso (Digite 1 para Normal e 2 para Vip): ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                Normal normal = new Normal();
                normal.imprime();
                break;
            case 2:
                System.out.println("Ingresso vip selecionado!");
                System.out.println("Escolha a localizacao (Digite 1 para Inferior e 2 para Superior): ");
                int opcao2 = entrada.nextInt();

                switch (opcao2) {
                    case 1:
                        CamaroteInferior camaroteInferior = new CamaroteInferior();
                        camaroteInferior.imprime();
                        break;
                    case 2:
                        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
                        camaroteSuperior.imprime();
                        break;
                    default:
                        System.out.println("Opcao incorreta! Selecione apenas 1 ou 2.");
                        break;
                }
                break;
            default:
                System.out.println("Opcao invalida! Selecione apenas 1 ou 2.");
                break;
        }
    }
}
