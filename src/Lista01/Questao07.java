package Lista01;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual valor em real?");
        double valorReal = entrada.nextDouble();
        double valorEuro = valorReal * 6.24;

        System.out.println("Valor em euro e de: " + valorEuro);
    }
}
