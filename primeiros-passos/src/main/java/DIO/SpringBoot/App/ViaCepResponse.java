package DIO.SpringBoot.App;

import org.springframework.stereotype.Component;

@Component
public class ViaCepResponse {

    private String cep;
    private String localidade;
    private String logradouro;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public ViaCepResponse(String cep, String localidade, String logradouro) {
        this.cep = cep;
        this.localidade = localidade;
        this.logradouro = logradouro;
    }
}

