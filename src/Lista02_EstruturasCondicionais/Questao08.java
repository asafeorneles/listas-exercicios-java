package Lista02_EstruturasCondicionais;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o seu salario: ");
        double salario = entrada.nextDouble();

        System.out.print("Informe o valor da prestacao: ");
        double prestacao = entrada.nextDouble();

        double limite = salario * 0.30;

        boolean aprovado = prestacao <= limite;

        if (aprovado) {
            System.out.println("Seu financiamento pode ser aprovado!");
        } else {
            System.out.println("Seu financiamento nao pode ser aprovado pois ultrapassa 30% do seu salario.");
        }
    }
}
