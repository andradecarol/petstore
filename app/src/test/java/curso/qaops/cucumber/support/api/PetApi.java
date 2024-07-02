package curso.qaops.cucumber.support.api;

import curso.qaops.cucumber.support.domain.Pet;
import lombok.Builder;
import lombok.Data;

import java.util.List;

import static io.restassured.RestAssured.given;

public class PetApi {

    private static final String FIND_PET_BY_STATUS_ENDPOINT = "/v3/pet/findByStatus?status={status}";

    public List<Pet> getPetByStatus(String status) {
        return given().
            pathParam("status", status).
        when().
            get(FIND_PET_BY_STATUS_ENDPOINT).
        then().
            extract().body().jsonPath().getList("", Pet.class);
    }
}
