package Lista01_EntradaSaidaEOperacoesBasicas;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 notas");

        double nota1, nota2, nota3;
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media das notas são: " + media);
    }
}
