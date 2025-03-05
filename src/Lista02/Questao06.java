package Lista02;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de km percorridos: ");
        double km = entrada.nextDouble();

        System.out.print("Informe a quantidade de litros consumidos: ");
        double litros = entrada.nextDouble();

        double media = km / litros;

        boolean economico = media < 8;
        boolean moderado = media >= 8 && media <= 12;

        if (economico) {
            System.out.println("Economico");
        } else if (moderado) {
            System.out.println("Moderado");
        } else {
            System.out.println("Eficiente");
        }
    }
}
