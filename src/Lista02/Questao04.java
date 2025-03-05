package Lista02;

import java.util.Scanner;

public class Questao04 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu salario bruto: " );
        double salarioBruto = entrada.nextDouble();

        double salarioLiquido = salarioBruto - salarioBruto * 0.185;

        System.out.println("O seu salario liquido: " + salarioLiquido);
        System.out.println("Informe o valor dos seus 4 boletos: ");
        double boleto01 = entrada.nextDouble();
        double boleto02 = entrada.nextDouble();
        double boleto03 = entrada.nextDouble();
        double boleto04 = entrada.nextDouble();
        double totalBoletos = boleto01 + boleto02 + boleto03 + boleto04;

        boolean sobrou = salarioLiquido > totalBoletos;

        if (sobrou) {
            double sobra = salarioLiquido - totalBoletos;
            System.out.println("Sobrou R$ " + sobra + " Enviando para poupanca...");
        } else {
            System.out.println("Deu ruim.");
        }
    }
}
