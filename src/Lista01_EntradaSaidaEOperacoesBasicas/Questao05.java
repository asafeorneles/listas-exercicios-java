package Lista01_EntradaSaidaEOperacoesBasicas;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura que queira converter: ");

        double temperatura = entrada.nextDouble();
        double fahrenheit = ( 1.8 * temperatura + 32);

        System.out.println("Sua temperatura em fahrenheit e de: " + fahrenheit);
    }
}
