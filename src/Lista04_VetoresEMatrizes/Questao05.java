package Lista04_VetoresEMatrizes;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] temperaturaMedia = new double[12];
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("Insira a temperatura media de cada mes:");
        temperaturaMedia[0] = entrada.nextDouble();

        double menorTemperatura = temperaturaMedia[0];
        double maiorTemperatura = temperaturaMedia[0];
        String mesMaior = meses[0];
        String mesMenor = meses[0];
        int numMesMaior = 1;
        int numMesMenor = 1;

        for (int i = 1; i < temperaturaMedia.length; i++) {
            System.out.println("Mes " + (i + 1) + ":");
            temperaturaMedia[i] = entrada.nextDouble();

            if (temperaturaMedia[i] > maiorTemperatura) {
                maiorTemperatura = temperaturaMedia[i];
                mesMaior = meses[i];
                numMesMaior = i + 1;
            }
            if (temperaturaMedia[i] < menorTemperatura) {
                menorTemperatura = temperaturaMedia[i];
                mesMenor = meses[i];
                numMesMenor = i + 1;
            }
        }
        System.out.println("Mes com maior temperatura: " + numMesMaior + " - " + mesMaior + ". (" + maiorTemperatura + "C)");
        System.out.println("Mes com menor temperatura: " + numMesMenor + " - " + mesMenor + ". (" + menorTemperatura + "C)");
    }
}
