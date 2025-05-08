import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    private static final String API_KEY = "321cf5f27692e73a6c2fda6c";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double convertir(String moneda1, String moneda2, double cantidad) throws IOException, InterruptedException {
        String url = BASE_URL + API_KEY + "/pair/" + moneda1 + "/" + moneda2 + "/" + cantidad;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Error al obtener respuesta del servidor. Código: " + response.statusCode());
        }

        Gson gson = new Gson();
        Conversion conversion = gson.fromJson(response.body(), Conversion.class);
        return conversion.getResultado();
    }
}
