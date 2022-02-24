package guru.springframework.sfgdi.services;

<<<<<<< HEAD
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
=======
/**
 * Created by jt on 12/27/19.
 */
public class PrimaryGreetingService implements GreetingService {
>>>>>>> di-in-java-config

    @Override
    public String sayGreeting() {
        return "Hello World :: PrimaryGreetingService.java";
    }
}
