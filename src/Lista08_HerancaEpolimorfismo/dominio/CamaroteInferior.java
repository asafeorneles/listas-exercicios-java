package Lista08_HerancaEpolimorfismo.dominio;

public class CamaroteInferior extends Vip{
    private String localizacao = "Inferior";

    @Override
    public void imprime() {
        System.out.println("Ingresso VIP: Camarote Inferior");
        super.imprime();
    }

    @Override
    public double calculaValorAdicional() {
        return VALOR_INGRESSO + VALOR_ADICIONAL_VIP;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
