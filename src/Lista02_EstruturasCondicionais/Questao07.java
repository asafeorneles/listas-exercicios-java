package Lista02_EstruturasCondicionais;

import java.util.Random;
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random random = new Random();
        int numeroCorreto = random.nextInt(10) + 1;

        boolean acertou = false;

        while (!acertou) {
            System.out.println("Tente acertar o numero de 1 a 10 gerado pelo sistema: ");
            int palpite = entrada.nextInt();

            if (palpite == numeroCorreto) {
                System.out.println("Parabens! Numero correto");
                acertou = true;
            } else if (palpite > numeroCorreto) {
                System.out.println("Numero errado! Seu palpite foi maior");
            } else {
                System.out.println("Numero errado! Seu palpite foi menor");
            }
        }
    }
}
