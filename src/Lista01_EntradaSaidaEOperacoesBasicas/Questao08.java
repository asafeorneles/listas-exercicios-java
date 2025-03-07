package Lista01_EntradaSaidaEOperacoesBasicas;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a largura e a comprimento do comodo.");

        double largura = entrada.nextDouble();
        double comprimento = entrada.nextDouble();
        double area = largura * comprimento;

        System.out.println("Area do comodo e: " + area + "m²");

        for (int i = 0; i < 2; i++){
            System.out.println("Deseja calcular mais algum comodo? Digite 1 para sim e 2 para nao.");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a largura e a comprimento do comodo.");

                    largura = entrada.nextDouble();
                    comprimento = entrada.nextDouble();
                    area = largura * comprimento;

                    System.out.println("Area do comodo e: " + area + "m²");
                    break;
                case 2:
                    System.out.println("Ok");
                    i = 2;
                    break;
                default:
                    System.out.println("Opcao invalida, digite apenas 1 ou 2");
                    i--;
                    break;
            }
        }
    }
}
