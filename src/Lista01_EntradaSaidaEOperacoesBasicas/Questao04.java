package Lista01_EntradaSaidaEOperacoesBasicas;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos metros quer converter: ");

        double metros = entrada.nextDouble();
        double polegadas = metros * 39.37;
        double pes = metros * 3.281;

        System.out.println("O valor em polegadas e de: " + polegadas);
        System.out.println("O valor em pe e de: " + pes);
    }
}
