package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import swagger.petstore.Application;
import swagger.petstore.rest.pet.Pet;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = Application.class)
public class PetTests {

    @Autowired
    private Pet pet;

    private final List<String> photoUrls = new ArrayList<>();

    @Test
    void test() {
        photoUrls.add("fffff");
        pet.addPet("Dog", photoUrls);
    }

    @AfterEach
    void afterEach() {
        photoUrls.clear();
    }
}
