package Lista04_VetoresEMatrizes;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[9];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor da posicao " + i + ":");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("Numeros primos: ");

        for (int i = 0; i < vetor.length; i++) {
            int divisor = 0;

            for (int j = 1; j <= vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    divisor++;
                }
            }

            if (divisor == 2) {
                System.out.println(vetor[i] + ", Posicao: " + i);
            }
        }
    }
}
