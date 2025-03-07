package Lista03_EstruturasDeRepeticao;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor de n: " );
        int n = entrada.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++){
            int potencia = 1;

            for (int j = 0; j < i; j++){
                potencia *= i;
            }
            soma += potencia;
        }

        System.out.println("O resultado da expressao S" + n + " = " + soma);
    }
}
