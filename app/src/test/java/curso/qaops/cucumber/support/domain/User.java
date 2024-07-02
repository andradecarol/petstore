package curso.qaops.cucumber.support.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    @Builder.Default
    private int id = 1;
    @Builder.Default
    private String username = "carolcucumber";
    @Builder.Default
    private String firstName = "carol";
    @Builder.Default
    private String last = "andrade";
    @Builder.Default
    private String email = "carol@carol.com";
    @Builder.Default
    private String pass = "12345";
    @Builder.Default
    private String phone = "1399999999";
    @Builder.Default
    private int userStatus = 1;

}
