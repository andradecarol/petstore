package curso.qaops.cucumber.steps;

import curso.qaops.cucumber.support.api.UserApi;
import curso.qaops.cucumber.support.domain.User;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserStepDefinitions {

    private static final String CREATE_USER_ENDPOINT = "/v3/user";
    private static final String USER_ENDPOINT = "/v3/user/{username}";

    private User expectedUser;
    private UserApi userApi;

    public UserStepDefinitions() {
        userApi = new UserApi();
    }

    @Quando("crio um usuario")
    public void crioUmUsuario() {
        expectedUser = User.builder().build();
        userApi.createUser(expectedUser);
    }

    @Entao("o usuário é salvo no sistema")
    public void oUsuarioESalvoNoSistema() {
        String actualUserName = userApi.getUsername(expectedUser);
        assertThat(actualUserName, is(expectedUser.getUsername()));
    }


}
