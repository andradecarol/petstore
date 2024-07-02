package curso.qaops.cucumber.support.api;

import curso.qaops.cucumber.support.domain.User;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class UserApi {

    private static final String CREATE_USER_ENDPOINT = "/v3/user";
    private static final String USER_ENDPOINT = "/v3/user/{username}";

    public void createUser(User user){
        given().
            body(user).
        when().
            post(CREATE_USER_ENDPOINT).
        then().
            statusCode(HttpStatus.SC_OK);
    }

    public String getUsername(User user) {
        return given().
            pathParam("username", user.getUsername()).
        when().
            get(USER_ENDPOINT).
        thenReturn().
            path("username");
    }

    public void deleteAllUsers(){
        List<String> usersList = Arrays.asList("carolcucumber");

        for(String user: usersList){
            given().
                pathParam("username", user).
            when().
                delete(USER_ENDPOINT).
            then().
                statusCode(HttpStatus.SC_OK);
        }

    }
}
