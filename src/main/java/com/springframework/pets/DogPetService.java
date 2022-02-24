<<<<<<<< HEAD:src/main/java/guru/springframework/pets/DogPetService.java
package guru.springframework.pets;
========
package com.springframework.pets;
>>>>>>>> di-in-java-config:src/main/java/com/springframework/pets/DogPetService.java

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
@Service
<<<<<<<< HEAD:src/main/java/guru/springframework/pets/DogPetService.java
public class DogPetService implements PetService{

========
public class DogPetService implements PetService {
>>>>>>>> di-in-java-config:src/main/java/com/springframework/pets/DogPetService.java
    public String getPetType(){
        return "Dogs are the best!";
    }
}
