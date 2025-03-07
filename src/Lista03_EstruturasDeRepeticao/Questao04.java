package Lista03_EstruturasDeRepeticao;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia, o mes e o ano mais antigo: ");
        int diaAntigo = entrada.nextInt();
        int mesAntigo = entrada.nextInt();
        int anoAntigo = entrada.nextInt();

        System.out.println("Digite o dia, o mes e o ano mais recente: ");
        int diaRecente = entrada.nextInt();
        int mesRecente = entrada.nextInt();
        int anoRecente = entrada.nextInt();

        int dias = 0;

        while (diaAntigo < diaRecente || mesAntigo < mesRecente || anoAntigo < anoRecente ) {
            diaAntigo++;
            dias++;

            if (diaAntigo > diasNoMes(mesAntigo, anoAntigo)) {
                diaAntigo = 1;
                mesAntigo++;
            }
            if (mesAntigo > 12){
                mesAntigo = 1;
                anoAntigo++;
            }
        }
        System.out.println("O numero de dias entre as datas = " + dias);

    }
    public static int diasNoMes (int mes, int ano) {
        int [] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && isBissexto(ano)) {
            return 29;
        }
        return diasPorMes[mes - 1];
    }

    public static boolean isBissexto(int ano){
        return (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);
    }
}
