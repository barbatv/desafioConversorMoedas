public class ConversorMoedas {

    private ApiRequest apiRequest;

    public ConversorMoedas() {
        this.apiRequest = new ApiRequest();
    }

    public String converterMoeda(String moedaOrigem, String moedaDestino, double valor) {
        Data result = apiRequest.buscaValor(moedaOrigem, moedaDestino, String.valueOf(valor));
        return  "Valor de " + valor + " [" + moedaOrigem + "]"
                + " corresponde ao valor final de ==> " + result.conversion_result() + " [" + moedaDestino + "]";
    }
}


