package tests;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class PetTests extends BaseTests {

    private final List<String> photoUrls = new ArrayList<>();

    @Test
    void test() {
        photoUrls.add("fffff");
        pet.addPet("Dog", photoUrls);
    }

    @Test
    void test2() {
        log.info("Error: not boolean");
        assertTrue(1 < 0);
    }

    @AfterEach
    void afterEach() {
        photoUrls.clear();
    }
}