package Lista04_VetoresEMatrizes;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] alunosNum = new int[10][2];
        char[] gabarito = new char[8];
        double aprovados = 0;

        System.out.println("Gabarito da prova: ");
        for (int i = 0; i < gabarito.length; i++) {
            System.out.println("Questao " + (i + 1) + ":");
            gabarito[i] = entrada.next().charAt(0);
        }

        for (int i = 0; i < alunosNum.length; i++) {
            System.out.println("Digite o numero do aluno " + (i + 1) + ":");
            alunosNum[i][0] = entrada.nextInt();

            System.out.println("Digite as respostas do aluno:");
            int questoesCertas = 0;

            for (int j = 0; j < gabarito.length; j++) {
                System.out.println("Questao " + (j + 1) + ": ");
                char questaoMarcadas = entrada.next().charAt(0);

                if (questaoMarcadas == gabarito[j]) {
                    questoesCertas++;
                }
            }

            alunosNum[i][1] = questoesCertas;

            if (questoesCertas >= 6) {
                aprovados++;
            }
        }
        double porcetagem = (aprovados / alunosNum.length) * 100;

        System.out.println("Resultado:");
        for (int i = 0; i < alunosNum.length; i++) {
            System.out.println("Aluno: " + alunosNum[i][0] + " / Acertos:  " + alunosNum[i][1]);
        }
        System.out.printf("Porcentagem de aprovacao: %.2f%%\n", porcetagem);
    }
}
