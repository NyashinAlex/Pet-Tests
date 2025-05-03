package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import steps.rest.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetTests {

    private final Pet pet = new Pet();
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
