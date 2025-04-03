package AtividadeAvaliativa1;

import java.util.Scanner;

public class AtividadeAvaliativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[][] timesOitavas = {{'A', 'B'}, {'C', 'D'}, {'E', 'F'}, {'G', 'H'}, {'I', 'J'}, {'K', 'L'}, {'N', 'O'}, {'P', 'Q'}};
        int[][] placarOitavas = new int[8][2];
        char[] vencedoresOitavas = new char[8];

        char[][] timesQuartas = new char[4][2];
        int[][] placarQuartas = new int[4][2];
        char[] vencedoresQuartas = new char[4];

        char[][] timesSemi = new char[2][2];
        int[][] placarSemi = new int[2][2];
        char[] vencedoresSemi = new char[2];

        char[] timesFinal = new char[2];
        int[] placarFinal = new int[2];
        char campeao = 'o';

        int[][] resultado = new int[15][2];
        int contador = 0;

        System.out.println("OITAVAS DE FINAL");
        for (int i = 0; i < placarOitavas.length; i++) {
            System.out.println("Resultado do jogo " + (i + 1) + ":");

            for (int j = 0; j < placarOitavas[i].length; j++) {
                int gol;
                do {
                    System.out.println("Time " + timesOitavas[i][j] + ":");
                    gol = entrada.nextInt();

                    if (gol < 0 || gol > 20) {
                        System.out.println("Valor invalido! Os gols devem estar entre 0 e 20.");
                    }
                }
                while (gol < 0 || gol > 20);

                placarOitavas[i][j] = gol;
                resultado[i][j] = gol;
            }

            while (placarOitavas[i][0] == placarOitavas[i][1]) {
                System.out.println("Nao e permitido empates! Digite novamente:");

                for (int j = 0; j < placarOitavas[i].length; j++) {
                    int gol;
                    do {
                        System.out.println("Time " + timesOitavas[i][j] + ":");
                        gol = entrada.nextInt();

                        if (gol < 0 || gol > 20) {
                            System.out.println("Valor invalido! Os gols devem estar entre 0 e 20.");
                        }
                    }
                    while (gol < 0 || gol > 20);

                    placarOitavas[i][j] = gol;
                    resultado[i][j] = gol;
                }
            }

            if (placarOitavas[i][0] > placarOitavas[i][1]) {
                vencedoresOitavas[i] = timesOitavas[i][0];
            } else {
                vencedoresOitavas[i] = timesOitavas[i][1];
            }
        }

        for (int i = 0; i < timesQuartas.length; i++) {
            for (int j = 0; j < timesQuartas[i].length; j++) {
                timesQuartas[i][j] = vencedoresOitavas[contador];
                contador++;
            }
        }

        System.out.println("QUARTAS DE FINAL");
        for (int i = 0; i < placarQuartas.length; i++) {
            System.out.println("Resultado do jogo " + (i + 9) + ":");

            for (int j = 0; j < placarQuartas[i].length; j++) {
                int gol;
                do {
                    System.out.println("Time " + timesQuartas[i][j] + ":");
                    gol = entrada.nextInt();

                    if (gol < 0 || gol > 20) {
                        System.out.println("Valor invalido! Os gols devem estar entre 0 e 20.");
                    }
                }
                while (gol < 0 || gol > 20);

                placarQuartas[i][j] = gol;
                resultado[i + 8][j] = gol;
            }

            while (placarQuartas[i][0] == placarQuartas[i][1]) {
            System.out.println("Nao e permitido empates! Digite novamente:");
                for (int j = 0; j < placarQuartas[i].length; j++) {
                    int gol;
                    do {
                        System.out.println("Time " + timesQuartas[i][j] + ":");
                        gol = entrada.nextInt();

                        if (gol < 0 || gol > 20) {
                            System.out.println("Valor invalido! Os gols devem estar entre 0 e 20.");
                        }
                    }
                    while (gol < 0 || gol > 20);

                    placarQuartas[i][j] = gol;
                    resultado[i + 8][j] = gol;
                }
            }

            if (placarQuartas[i][0] > placarQuartas[i][1]) {
                vencedoresQuartas[i] = timesQuartas[i][0];
            } else {
                vencedoresQuartas[i] = timesQuartas[i][1];
            }
        }



        contador = 0;
        for (int i = 0; i < timesSemi.length; i++) {
            for (int j = 0; j < timesSemi[i].length; j++) {
                timesSemi[i][j] = vencedoresQuartas[contador];
                contador++;
            }
        }

        System.out.println("SEMIFINAL");
        for (int i = 0; i < placarSemi.length; i++) {
            System.out.println("Resultado do jogo " + (i + 13) + ":");

            for (int j = 0; j < placarSemi[i].length; j++) {
                int gol;
                do {
                    System.out.println("Time " + timesSemi[i][j] + ":");
                    gol = entrada.nextInt();
                    if (gol < 0 || gol > 20) {
                        System.out.println("Valor invalido! Os gols devem estar entre 0 e 20.");
                    }
                }
                while (gol < 0 || gol > 20);

                placarSemi[i][j] = gol;
                resultado[i + 12][j] = gol;
            }

            while (placarSemi[i][0] == placarSemi[i][1]) {
                System.out.println("Nao e permitido empates! Digite novamente:");
                for (int j = 0; j < placarSemi[i].length; j++) {
                    int gol;
                    do {
                        System.out.println("Time " + timesSemi[i][j] + ":");
                        gol = entrada.nextInt();
                        if (gol < 0 || gol > 20) {
                            System.out.println("Valor invalido! Os gols devem estar entre 0 e 20.");
                        }
                    }
                    while (gol < 0 || gol > 20);

                    placarSemi[i][j] = gol;
                    resultado[i + 12][j] = gol;
                }
            }

            if (placarSemi[i][0] > placarSemi[i][1]) {
                vencedoresSemi[i] = timesSemi[i][0];
            } else {
                vencedoresSemi[i] = timesSemi[i][1];
            }
        }



        for (int i = 0; i < timesFinal.length; i++) {
            timesFinal[i] = vencedoresSemi[i];
        }

        System.out.println("FINAL");
        System.out.println("Resultado da final:");
        for (int i = 0; i < placarFinal.length; i++) {
            int gol;
            do {
                System.out.println("Time " + timesFinal[i] + ":");
                gol = entrada.nextInt();

                if (gol < 0 || gol > 20) {
                    System.out.println("Valor invalido! Os gols devem estar entre 0 e 20.");
                }
            }
            while (gol < 0 || gol > 20);

            placarFinal[i] = gol;
            resultado[14][i] = gol;

            while (placarFinal[1] == placarFinal[0]) {
                System.out.println("Nao e permitido empates! Digite novamente:");
                do {
                    System.out.println("Time " + timesFinal[i] + ":");
                    gol = entrada.nextInt();

                    if (gol < 0 || gol > 20) {
                        System.out.println("Valor invalido! Os gols devem estar entre 0 e 20.");
                    }
                }
                while (gol < 0 || gol > 20);

                placarFinal[i] = gol;
                resultado[14][i] = gol;
            }
            if (placarFinal[0] > placarFinal[1]) {
                campeao = timesFinal[0];
            } else {
                campeao = timesFinal[1];
            }
        }


        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Jogo " + (i + 1) + ": " + resultado[i][0] + " x " + resultado[i][1]);
        }

        System.out.println("Campeao: " + campeao);

    }
}
