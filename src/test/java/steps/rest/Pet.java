package steps.rest;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import pojo.pet.add.AddPet;
import rest.BaseRest;

import java.util.List;

@Slf4j
public class Pet extends BaseRest {

    private static final String ADD_PET = "/pet";

    @Step("Добавление нового питомца")
    public void addPet(String namePet, List<String> photoUrls) {
        AddPet pet = AddPet.builder()
                .name(namePet)
                .photoUrls(photoUrls)
                .build();

        post(pet, ADD_PET);
    }
}
