package Lista01;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os valores dos 3 produtos: ");

        double produto1 = entrada.nextDouble();
        double produto2 = entrada.nextDouble();
        double produto3 = entrada.nextDouble();
        double totalProdutos = produto1 + produto2 + produto3;

        System.out.println("Qual valor fornecido para pagar a compra?");

        double valorDado = entrada.nextDouble();
        double troco = valorDado - totalProdutos;

        if (valorDado < totalProdutos){
            System.out.println("Valor fornecido é insuficiente.");
        } else {
            System.out.println("Seu troco e de: " + troco);
        }

    }
}
