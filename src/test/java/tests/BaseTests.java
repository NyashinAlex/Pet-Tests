package tests;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import swagger.petstore.Application;
import swagger.petstore.rest.pet.Pet;

@Slf4j
@SpringBootTest(classes = Application.class)
public class BaseTests {

    @Autowired
    protected Pet pet;
}
