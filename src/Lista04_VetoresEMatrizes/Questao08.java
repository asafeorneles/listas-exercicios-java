package Lista04_VetoresEMatrizes;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] vendas = new double[12][4];
        double[] vendasMes = new double[12];
        double[] vendasSemanas = new double[4];
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        double totalVendasAno = 0;

        for (int i = 0; i < vendas.length; i++) {
            System.out.println("Vendas do mes de " + meses[i] + ":\n");
            double totalVendasMes = 0;

            for (int j = 0; j < vendas[i].length; j++) {
                System.out.println("Semana " + (j + 1) + ": ");
                vendas[i][j] = entrada.nextDouble();

                vendasSemanas[j] += vendas[i][j];

                totalVendasMes += vendas[i][j];
                totalVendasAno += vendas[i][j];
            }
            vendasMes[i] = totalVendasMes;
        }

        System.out.println("\nRELATORIO:\n");
        for (int i = 0; i < vendasMes.length; i++) {
            System.out.printf("Total vendido em %s : R$%.2f\n", meses[i], vendasMes[i]);
        }

        for (int i = 0; i < vendasSemanas.length; i++) {
            System.out.printf("\nTotal vendido nas semanas %d : R$%.2f\n ", (i + 1), vendasSemanas[i]);
        }

        System.out.println();

        System.out.printf("\nTotal vendido no ano: R$%.2f",  totalVendasAno);
    }
}
