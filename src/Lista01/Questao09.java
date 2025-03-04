package Lista01;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do produto comprado:");
        double valorProduto = entrada.nextDouble();
        double produtoComDesconto = valorProduto - valorProduto * 0.15;

        System.out.println("Valor do produto com 15% de desconto: " + produtoComDesconto);
    }
}
