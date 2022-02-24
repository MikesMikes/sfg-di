package guru.springframework.sfgdi.services;

<<<<<<< HEAD:src/main/java/guru/springframework/sfgdi/services/I18nSpanishGreetingService.java
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{

=======
/**
 * Created by jt on 12/27/19.
 */

//@Service("i18nService")
public class I18NSpanishService implements GreetingService {
>>>>>>> di-in-java-config:src/main/java/guru/springframework/sfgdi/services/I18NSpanishService.java
    @Override
    public String sayGreeting() {
        return "Hola Mundo :: i18nSpanishGreetingService.class";
    }
}
