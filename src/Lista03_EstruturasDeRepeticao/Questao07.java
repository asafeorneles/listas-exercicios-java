package Lista03_EstruturasDeRepeticao;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor da conta atualmente?");
        double conta = entrada.nextDouble();

        System.out.println("Qual o valor da dose?");
        double valorDose = entrada.nextDouble();

        double taxa = 0.10;
        double contaAtual;

        while (true){
            System.out.println("Deseja ouvir mais um modao? (Digite 1 para sim e 2 para nao)");
            int opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    conta += valorDose;
                    contaAtual = conta + conta * taxa;
                    System.out.println("Conta: R$" + contaAtual);
                    System.out.println("Taxa ja inclusa: R$" + taxa * conta);
                    break;
                case 2:
                    contaAtual = conta + conta * taxa;
                    System.out.println("Conta fechada.");
                    System.out.println("Conta: R$" + contaAtual);
                    System.out.println("Taxa ja inclusa: R$" + taxa * conta);
                    return;
                default:
                    System.out.println("Comando invalido!");
                    break;
            }
        }
    }
}
