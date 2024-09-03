package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import models.response.ReturnResponse;
import org.junit.Assert;
import service.GetRickAndMortyService;
import service.TestSupportService;

public class GetRickAndMortySteps extends TestSupportService {

    GetRickAndMortyService getRickAndMortyService = new GetRickAndMortyService();

    @Quando("eu enviar no endpoint {string} usando o id {string}")
    public void euEnviarNoEndpointUsandoOId(String endpoint, String id) {
        getRickAndMortyService.GetRickAndMortyApi(endpoint, id);
    }

    @Entao("o status devera ser {string}")
    public void oStatusDeveraSer(String status) {
        String response = getResponseTestContext().jsonPath().prettify();
        ReturnResponse returnResponse = gson.fromJson(response, ReturnResponse.class);

        Assert.assertEquals(status, returnResponse.getStatus());
    }

    @E("o servidor deve me retornar o status code {int}")
    public void oServidorDeveMeRetornarOStatusCode(int statusCode) {
        Assert.assertEquals(statusCode, getResponseTestContext().statusCode());
    }
}
