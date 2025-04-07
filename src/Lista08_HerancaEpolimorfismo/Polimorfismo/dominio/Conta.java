package Lista08_HerancaEpolimorfismo.Polimorfismo.dominio;

public abstract class  Conta implements Operacoes {
    protected int numero;
    protected String titulo;
    protected double saldo;
    protected boolean cancelada = true;

    public Conta(int numero, String titulo, double saldo, boolean cancelada) {
        this.numero = numero;
        this.titulo = titulo;
        this.saldo = saldo;
        this.cancelada = cancelada;
    }

    public void cancelada(){
        if (isCancelada()) {
            System.out.println("Conta cancelada. Operação não permitida.");
            return;
        }
    }

    public abstract void imprime();

    @Override
    public abstract void retirada(double valorRetirada);

    @Override
    public abstract void deposito(double valorDepositado);

    public boolean isCancelada() {
        return cancelada;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero() {
        return numero;
    }
}
