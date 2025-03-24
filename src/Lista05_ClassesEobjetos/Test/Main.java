package Lista05_ClassesEobjetos.Test;

import Lista05_ClassesEobjetos.Dominio.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        System.out.println("Digite seu nome: ");
        pessoa.setNome(entrada.nextLine());

        System.out.println("Digite seu sobrenome: ");
        pessoa.setSobrenome(entrada.nextLine());

        System.out.println("Digite sua idade: ");
        pessoa.setIdade(entrada.nextInt());

        System.out.println("Digite sua altura: ");
        pessoa.setAltura(entrada.nextDouble());

        System.out.println("Digite seu peso: ");
        pessoa.setPeso(entrada.nextDouble());

        pessoa.imprime();

    }
}
