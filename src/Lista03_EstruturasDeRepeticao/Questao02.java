package Lista03_EstruturasDeRepeticao;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor que que deseja ver o fatorial: ");
        int valor = entrada.nextInt();

        int fatorial = 1;

        for (int i = valor; i > 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + valor + " = " + fatorial);
    }
}
