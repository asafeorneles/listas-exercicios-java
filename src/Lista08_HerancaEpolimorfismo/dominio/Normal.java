package Lista08_HerancaEpolimorfismo.dominio;

public class Normal extends Ingresso{

    @Override
    public void imprime() {
        System.out.println("Ingresso Normal");
        System.out.println("Valor: " + VALOR_INGRESSO);
    }
}
