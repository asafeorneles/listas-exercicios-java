package Lista04_VetoresEMatrizes;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] objetos = new double[10][3];
        String[] ordens = {"primeiro", "segundo", "terceiro", "quarto", "quinto",
                "sexto", "setimo", "oitavo", "nono", "decimo"};
        double salario = 545.0;
        double totalVendas = 0;
        int maisVendido = 0;
        int menosVendido = 0;

        for (int i = 0; i < objetos.length; i++) {
            System.out.println("Informe o preço do " + ordens[i] + " objeto:");
            objetos[i][0] = entrada.nextDouble();
            System.out.println("Quantos unidades foram vendidas?");
            objetos[i][1] = entrada.nextDouble();

            if (objetos[i][1] > objetos[maisVendido][1]) {
                maisVendido = i;
            }
            if (objetos[i][1] < objetos[menosVendido][1]) {
                menosVendido = i;
            }

            objetos[i][2] = objetos[i][0] * objetos[i][1];
            totalVendas += objetos[i][2];
        }

        double comissao = totalVendas * 0.05;
        double salarioFinal = comissao + salario;

        System.out.println("RELATORIO:\n");

        for (int i = 0; i < objetos.length; i++) {
            System.out.println("Objeto " + (i + 1) + ":");
            System.out.println("Quantidade vendida: " + objetos[i][1]);
            System.out.printf("Valor unitario: R$ %.2f\n", objetos[i][0]);
            System.out.printf("Valor total: R$ %.2f\n", objetos[i][2]);
            System.out.println();
        }

        System.out.printf("\n Valor geral das vendas: R$ %.2f\n", totalVendas);
        System.out.printf("Comissao do vendedor: R$ %.2f\n", comissao);
        System.out.printf("Salario total do vendedor: R$ %.2f\n", salarioFinal);

        System.out.println("\nObjeto mais vendido:" );
        System.out.printf("Posicao: %d | Preco: R$ %.2f | Quantidade vendida: %.0f",
                (maisVendido +1), objetos[maisVendido][0], objetos[maisVendido][1]);

        System.out.println("\nObjeto menos vendido:" );
        System.out.printf("Posicao: %d | Preco: R$ %.2f | Quantidade vendida: %.0f",
                (menosVendido + 1), objetos[menosVendido][0], objetos[menosVendido][1]);
    }
}