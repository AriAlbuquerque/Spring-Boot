package DIO.SpringBoot.App;

import com.google.gson.Gson;
import DIO.SpringBoot.PrimeirosProjetos.json.ViaCepResponse;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;

@Component
public class ConversorJson {
    private Gson gson = new Gson();
    public Gson converter(String json) {
        return gson = gson.fromJson(json, (Type) ViaCepResponse.class);
    }
}
