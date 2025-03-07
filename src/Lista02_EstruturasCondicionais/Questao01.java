package Lista02_EstruturasCondicionais;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota e a frequencia do aluno (A frequencia e de 0 a 1): ");
        double nota = entrada.nextDouble();
        double frequencia = entrada.nextDouble();

        if(nota >= 7 && frequencia >= 0.75){
            System.out.println("Aluno aprovado!");
        } else if ((nota >= 4  && nota <= 7) && frequencia >= 0.75) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
