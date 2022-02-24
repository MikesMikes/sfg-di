package guru.springframework.sfgdi.controllers;

<<<<<<< HEAD
import guru.springframework.pets.PetService;
=======
import com.springframework.pets.PetService;
>>>>>>> di-in-java-config
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
