package Lista01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de anos: ");
        int ano = entrada.nextInt();
        int segundos = ano * 31536000;

        System.out.println("Considerando que um ano tem 365 dias, o numero de segundos e " +segundos);
    }
}
