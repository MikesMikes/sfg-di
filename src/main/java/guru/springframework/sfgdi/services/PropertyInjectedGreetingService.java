package guru.springframework.sfgdi.services;

<<<<<<< HEAD
import org.springframework.stereotype.Service;


public class PropertyInjectedGreetingService implements GreetingService{
=======
/**
 * Created by jt on 12/27/19.
 */
public class PropertyInjectedGreetingService implements GreetingService {
>>>>>>> di-in-java-config
    @Override
    public String sayGreeting() {
        return "Hello World :: PropertyGreetingService.java";
    }
}
