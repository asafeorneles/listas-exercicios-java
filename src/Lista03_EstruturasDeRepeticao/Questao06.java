package Lista03_EstruturasDeRepeticao;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorIdade = -1;
        int menorIdade = -1;
        int quantidadeMulheres = 0;

        while (true){
            System.out.println("Digite a idade (Ou -1 para sair): ) ");
            int idade = entrada.nextInt();
            if (idade == -1){
                break;
            }

            System.out.println("Digite o sexo do habitante(F/M): ");
            char sexo = entrada.next().charAt(0);

            System.out.println("Digite a cor dos olhos (azuis, verdes ou castanhos): ");
            String corOlhos = entrada.next();

            System.out.println("Digite a cor dos cabelos (louros, castanhos, pretos)");
            String corCabelos = entrada.next();

            if (maiorIdade == -1 || idade > maiorIdade){
                maiorIdade = idade;
            }
            if (menorIdade == -1 || idade < menorIdade){
                menorIdade = idade;
            }

            if ((sexo == 'F') && (idade >= 18 && idade <= 35) && (corOlhos.equals("verdes")  && corCabelos.equals("louros"))){
                quantidadeMulheres++;

            }
        }
        if (maiorIdade == -1 || menorIdade == -1){
            System.out.println("Nenhum habitante foi cadastrado.");
        }
        else {
            System.out.println("Maior Idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Quantidade mulheres: " + quantidadeMulheres);
        }
    }
}
