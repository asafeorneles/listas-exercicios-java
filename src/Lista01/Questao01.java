package Lista01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 notas");

        int nota1, nota2, nota3;
        nota1 = entrada.nextInt();
        nota2 = entrada.nextInt();
        nota3 = entrada.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media das notas são: " + media);
    }
}
