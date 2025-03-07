package Lista03_EstruturasDeRepeticao;

public class Questao01 {
    public static void main(String[] args) {

        int multiploDois = 0;
        int multiploTres = 0;
        int multiplocinco = 0;

        for (int i = 1; i < 1000; i++){
            if (i % 2 == 0){
                multiploDois++;
            }
            if (i % 3 == 0){
                multiploTres++;
            }
            if (i % 5 == 0){
                multiplocinco++;
            }
        }

        System.out.println("Multiplo de dois: " + multiploDois);
        System.out.println("Multiplo de tres: " + multiploTres);
        System.out.println("Multiplo de cinco: " + multiplocinco);
    }
}
