import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequest {


    public Data buscaValor(String currency1, String currency2, String amount){

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/16470b5934b7ad61f3490e87/pair" + "/" +
                currency1 + "/" + currency2 + "/" + amount);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri((endereco))
                .build();

        try {

            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Data.class);


        } catch (Exception e) {
            throw new RuntimeException("Não deu bom");
        }


    }






}
