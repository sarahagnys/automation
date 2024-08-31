package service;

import models.response.ReturnResponse;
import static config.Config.environmentModel;

public class GetRickAndMorty extends TestSupportService {

    public void GetRickAndMortyApi(String endpoint, String id) {
        final String url = environmentModel.getRickAndMortyLocal() + endpoint + "/" + id;

        get(url);
        gson.fromJson(getResponseTestContext().jsonPath().prettify(), ReturnResponse.class);
    }
}
