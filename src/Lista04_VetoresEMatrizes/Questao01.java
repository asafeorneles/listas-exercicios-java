package Lista04_VetoresEMatrizes;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorX = new int[10];
        int[] vetorY = new int[10];
        int[] vetorZ = new int[20];
        int index = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor para a posicao " + i + " Do vetor X: ");
            vetorX[i] = entrada.nextInt();
            System.out.println("Digite um valor para a posicao " + i + " Do vetor Y: ");
            vetorY[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetorZ[index] = vetorX[i];
            index++;
            vetorZ[index] = vetorY[i];
            index++;
        }

        System.out.print("Z ={");
        for (int i = 0; i < vetorZ.length; i++) {
            System.out.print(vetorZ[i]);
            if (i < vetorZ.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
