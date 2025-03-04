package Lista01;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("Digite um valor inteiro: ");
        int valor = entrada.nextInt();

        for (int i = 0; i < notas.length; i++) {
            int quantidadeNotas = valor / notas[i];
            valor = valor - quantidadeNotas * notas[i];

            System.out.println("Notas de R$: " + notas[i] + ": " + quantidadeNotas);
        }
    }
}
