package curso.qaops.cucumber.support.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pet {

    @Builder.Default
    private int id = 2;
    @Builder.Default
    private String name = "Marcelina";
    @Builder.Default
    private PetCategory category = new PetCategory();
    @Builder.Default
    private String status = "available";
    @Builder.Default
    private List<String> photosUrls = Arrays.asList("url1", "url2");
}
