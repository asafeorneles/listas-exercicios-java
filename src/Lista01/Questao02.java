package Lista01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de seus 4 boletos.");

        double boleto1 = entrada.nextDouble();
        double boleto2 = entrada.nextDouble();
        double boleto3 = entrada.nextDouble();
        double boleto4 = entrada.nextDouble();

        double totalBoleto = boleto1 + boleto2 + boleto3 + boleto4;

        System.out.println("Qual o seu salario BRUTRO?");

        double salarioBruto = entrada.nextDouble();
        double salarioLiquido = salarioBruto - salarioBruto * 0.14;
        double restante = salarioLiquido - totalBoleto;

        System.out.println("Seu salário líquido e de: " + salarioLiquido);
        System.out.println("O total das suas contas é de: " + totalBoleto);
        System.out.println("Sobrou exaramente: " + restante);

    }
}
