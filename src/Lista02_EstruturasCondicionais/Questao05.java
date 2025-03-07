package Lista02_EstruturasCondicionais;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o seu salario atual: ");
        double salario = entrada.nextDouble();

        System.out.print("Informe o seu tempo de servico: ");
        double tempoServico = entrada.nextDouble();

        double salarioBasico = salario * 1.05;
        double salaeioPlus = salario * 1.10;

        boolean descontoBasico = tempoServico > 5 && tempoServico < 10;
        boolean descontoPlus = tempoServico > 10;

        if (descontoBasico) {
            System.out.println("Seu salaraio com bonus basico: R$" + salarioBasico);
        } else if (descontoPlus) {
            System.out.println("Seu salario com bonus plus: R$" + salaeioPlus);
        } else {
            System.out.println("Voce nao possui bonificacao. Seu salario: R$" + salario);
        }
    }
}
