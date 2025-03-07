package Lista01_EntradaSaidaEOperacoesBasicas;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("Digite um valor inteiro: ");
        int valor = entrada.nextInt();

        for (int nota : notas) {
            int quantidadeNotas = valor / nota;
            valor = valor - quantidadeNotas * nota;

            System.out.println("Notas de R$: " + nota + ": " + quantidadeNotas);
        }
    }
}
