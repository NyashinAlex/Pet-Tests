package rest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaseRest {

    @Value("${url.baseUrl}")
    private String baseUrl;

    public void post(Object body, String endpoint) {
        RestAssured.given()
                .contentType(ContentType.JSON)
                .log().all()
                .basePath(baseUrl + endpoint)
                .body(body)
                .when()
                .post(endpoint);
    }
}
