package swagger.petstore.rest.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import swagger.petstore.pojo.pet.add.AddPet;
import swagger.petstore.rest.BaseRest;

import java.util.List;

@Component
public class Pet {

    private static final String ADD_PET = "/pet";
    @Autowired
    private BaseRest baseRest;

    public void addPet(String namePet, List<String> photoUrls) {
        AddPet pet = AddPet.builder()
                .name(namePet)
                .photoUrls(photoUrls)
                .build();

        baseRest.post(pet, ADD_PET);
    }
}
