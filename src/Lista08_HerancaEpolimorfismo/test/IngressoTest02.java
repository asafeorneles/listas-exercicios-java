package Lista08_HerancaEpolimorfismo.test;

import Lista08_HerancaEpolimorfismo.dominio.*;

import java.util.Scanner;

public class IngressoTest02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = escolherIngresso(entrada);

    }

    public static void escolherIngresso(Scanner entrada) {
        do {
            System.out.println("Escolha seu ingresso (Digite 1 para Normal e 2 para Vip): ");
            int opcao = entrada.nextInt();
            if (opcao == 1) {
                Normal normal = new Normal();
                normal.imprime();
            }
        }
    }
}
