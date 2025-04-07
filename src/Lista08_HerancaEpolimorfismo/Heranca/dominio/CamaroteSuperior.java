package Lista08_HerancaEpolimorfismo.Heranca.dominio;

public class CamaroteSuperior extends Vip{
    private String localizacao = "Superior";
    public static final double VALOR_ADICIONAL_SUP = 10;

    @Override
    public void imprime() {
        System.out.println("Ingresso VIP: Camarote Superior");
        super.imprime();
    }

    @Override
    public double calculaValorAdicional(){
        return VALOR_INGRESSO + VALOR_ADICIONAL_VIP + VALOR_ADICIONAL_SUP;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
