package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class GetRickAndMortyStep {


    @Quando("eu enviar no endpoint {string} usando o id {string}")
    public void euEnviarNoEndpointUsandoOId(String endpoint, String id) {

    }

    @Entao("o status devera ser {string}")
    public void oStatusDeveraSer(String status) {
    }
}
