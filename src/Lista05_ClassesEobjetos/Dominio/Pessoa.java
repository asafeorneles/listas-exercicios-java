package Lista05_ClassesEobjetos.Dominio;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double IMC;

    public Pessoa(){

    }

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        calculaIMC();
    }

    public void calculaIMC() {
        this.IMC = peso / (altura * altura);
    }

    public void informaObesidade() {
        if (this.IMC < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (this.IMC >= 18.5 &&  this.IMC < 25) {
            System.out.println("Peso normal");
        }
        else if (this.IMC >= 25  &&  this.IMC < 30) {
            System.out.println("Sobrepeso");
        }
        else if (this.IMC >= 30  &&  this.IMC < 35) {
            System.out.println("Obesidade grau 1");
        }
        else if (this.IMC >= 35  &&  this.IMC < 40) {
            System.out.println("Obesidade grau 2");
        }
        else {
            System.out.println("Obesidade grau 3");
        }
    }

    public void imprime() {
        calculaIMC();
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + IMC);
        informaObesidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        calculaIMC();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        calculaIMC();
    }

    public double getIMC() {
        return IMC;
    }
}
