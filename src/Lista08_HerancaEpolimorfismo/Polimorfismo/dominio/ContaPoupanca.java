package Lista08_HerancaEpolimorfismo.Polimorfismo.dominio;

public class ContaPoupanca extends Conta{
    private int diaAniversario;
    public static final double TAXA_REMUNERACAO = 0.005;

    public ContaPoupanca(int numero, String titulo, double saldo, boolean cancelada, int diaAniversario) {
        super(numero, titulo, saldo, cancelada);
        this.diaAniversario = diaAniversario;
    }

    @Override
    public void retirada(double valorRetirada) {
        cancelada();
        if (valorRetirada <= this.saldo) {
            this.saldo -= valorRetirada;
        }
        else {
            System.out.println("Operaçao nao concluida, saldo insuficiente");
            return;
        }
    }

    @Override
    public void deposito(double valorDepositado) {
        cancelada();
        this.saldo += valorDepositado;
    }

    @Override
    public void imprime() {
        System.out.println("Conta poupança: ");
    }


}
