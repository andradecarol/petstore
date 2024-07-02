package curso.qaops.cucumber.steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import curso.qaops.cucumber.support.api.PetApi;
import curso.qaops.cucumber.support.domain.Pet;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.util.List;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

public class PetStepDefinitions {

    private PetApi petApi;
    private List<Pet> actualPets;

    public PetStepDefinitions(){
        petApi = new PetApi();
    }

    @Dado("que eu possua animais available")
    public void queEuPossuaAnimaisAvailable() throws JsonProcessingException {

//        Pet pet = Pet.builder().build();
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(pet);
//        System.out.println(json);

    }

    @Quando("eu pesquiso por todos os animais {word}")
    public void euPesquisoPorTodosOsAnimaisAvailable(String status) {
        actualPets = petApi.getPetByStatus(status);
    }

    @Entao("eu recebo a lista de animais available")
    public void euReceboAListaDeAnimaisAvailable() {
        assertThat(actualPets, is(not(empty())));
    }
}
