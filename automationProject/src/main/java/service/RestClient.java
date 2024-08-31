package service;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;

import static io.restassured.RestAssured.given;

public class RestClient {
    @Getter
    @Setter
    private static Response responseTestContext;

    protected Response executeRequest(Response request) {
        responseTestContext = request.then().extract().response();
        return responseTestContext;
    }

    protected void get (String url) {
     Response request = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .get(url);
        executeRequest(request);
    }
}
