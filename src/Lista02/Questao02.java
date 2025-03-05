package Lista02;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor inteiro:");
        int valor1 = entrada.nextInt();

        System.out.println("Informe o segundo valor inteiro:");
        int valor2 = entrada.nextInt();

        int soma = valor1 + valor2;

        if (soma % 2 == 0){
            System.out.println("A soma dos valores e par.");

        } else {
            System.out.println("A soma dos valores e impar.");
        }

        if (valor1 - valor2 <0){
            System.out.println("A diferenca dos dois valores e negativa.");
        } else if (valor1 - valor2 == 0) {
            System.out.println("A diferenca dos valores e zero.");
        } else {
            System.out.println("A diferenca dos valores e positiva.");
        }
    }
}
