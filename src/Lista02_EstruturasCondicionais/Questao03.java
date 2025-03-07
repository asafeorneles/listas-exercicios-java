package Lista02_EstruturasCondicionais;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("De uma nota de 0 a 10 para sua:");
        System.out.print("Altura: ");
        int altura = entrada.nextInt();

        System.out.print("Beleza: ");
        int beleza = entrada.nextInt();

        System.out.print("Carisma: ");
        int carisma = entrada.nextInt();

        boolean alta = altura > 7;
        boolean bonita = beleza > 7;
        boolean carismatica = carisma > 7;

        if (alta && bonita && carismatica) {
            System.out.println("Booora!");
        } else if ((alta && bonita) || (alta && carismatica) || (bonita && carismatica)) {
            System.out.println("So vai...");
        } else if (alta || bonita || carismatica) {
            System.out.println("Fe em Deus...");
        } else {
            System.out.println("Misericordia");
        }
    }
}
