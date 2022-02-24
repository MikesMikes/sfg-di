<<<<<<<< HEAD:src/main/java/guru/springframework/pets/CatPetService.java
package guru.springframework.pets;
========
package com.springframework.pets;
>>>>>>>> di-in-java-config:src/main/java/com/springframework/pets/CatPetService.java

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
<<<<<<<< HEAD:src/main/java/guru/springframework/pets/CatPetService.java
@Profile("cat")
@Service
========
@Service
@Profile("cat")
>>>>>>>> di-in-java-config:src/main/java/com/springframework/pets/CatPetService.java
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
