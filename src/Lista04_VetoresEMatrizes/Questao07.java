package Lista04_VetoresEMatrizes;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] ordens = {"primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto"};
        int[] numeros = new int[6];
        int[][] numPares = new int[6][2];
        int[][] numImpares = new int[6][2];

        int quantPares = 0;
        int somaPares = 0;
        int quantImpares = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + ordens[i] + " numero:");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0){
                numPares[quantPares][0] = numeros[i];
                numPares[quantPares][1] = i;
                somaPares += numeros[i];
                quantPares++;
            }
            else{
                numImpares[quantImpares][0] = numeros[i];
                numImpares[quantImpares][1] = i;
                quantImpares++;
            }
        }

        System.out.println("RELATORIO:");
        System.out.println("Os numeros pares sao: " );
        for (int i = 0; i < quantPares; i++){
            System.out.printf("numero %d, na posicao %d\n", numPares[i][0], numPares[i][1]);
        }

        System.out.println("Soma dos pares = " + somaPares + "\n");

        System.out.println("Os numeros  impares sao: " );

        for (int i = 0; i < quantImpares; i++) {
            System.out.printf("numero %d, na posicao %d\n", numImpares[i][0], numImpares[i][1]);
        }
        
        System.out.println("Quantidade de impares: " + quantImpares);
    }
}
