package Lista08_HerancaEpolimorfismo.Heranca.dominio;

public abstract class Vip extends Ingresso{
    public static final double VALOR_ADICIONAL_VIP = 35;

    @Override
    public void imprime() {
        System.out.println("Valor: " + calculaValorAdicional());
    }

    public abstract double calculaValorAdicional();
}
