package Lista04_VetoresEMatrizes;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[8];
        int[] vetorNegativo = new int[8];
        int[] vetorPositivo = new int[8];
        int contadorPositivo = 0, contadorNegativo = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posicao " + i + ":");
            vetor[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetorNegativo[contadorNegativo++] = vetor[i];
            } else {
                vetorPositivo[contadorPositivo++] = vetor[i];
            }
        }

        System.out.print("Vetor Negativo ={");
        for (int i = 0; i < contadorNegativo; i++) {
            System.out.print(vetorNegativo[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Vetor Positivo ={");
        for (int i = 0; i < contadorPositivo; i++) {
            System.out.print(vetorPositivo[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
