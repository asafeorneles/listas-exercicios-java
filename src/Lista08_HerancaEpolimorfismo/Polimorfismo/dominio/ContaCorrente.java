package Lista08_HerancaEpolimorfismo.Polimorfismo.dominio;

public class ContaCorrente extends Conta {
    private double limiteEspecial;
    private double totalDisponivel;

    public ContaCorrente(int numero, String titulo, double saldo, boolean cancelada, double limiteEspecial) {
        super(numero, titulo, saldo, cancelada);
        this.limiteEspecial = limiteEspecial;
        atlzTotalDisponivel();
    }

    public void atlzTotalDisponivel(){
        this.totalDisponivel = this.saldo + this.limiteEspecial;
    }

    @Override
    public void retirada(double valorRetirada) {
        cancelada();
        if (valorRetirada <= totalDisponivel) {
            this.saldo -= valorRetirada;
            if (saldo < 0) {
                this.limiteEspecial -= saldo * (-1);
                saldo = 0;
            }
            atlzTotalDisponivel();
        }
        else {
            System.out.println("Operaçao nao concluida, saldo ou limite insuficiente");
            return;
        }
    }

    @Override
    public void deposito(double valorDepositado) {
        cancelada();
        this.saldo += valorDepositado;
        atlzTotalDisponivel();
    }

    @Override
    public void imprime() {
        System.out.println("Conta corrente: ");
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public double getTotalDisponivel() {
        atlzTotalDisponivel();
        return totalDisponivel;
    }

}
