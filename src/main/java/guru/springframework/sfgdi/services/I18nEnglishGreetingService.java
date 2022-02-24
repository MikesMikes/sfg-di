package guru.springframework.sfgdi.services;


import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

<<<<<<< HEAD
@Profile({"EN","default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
=======
/**
 * Created by jt on 12/27/19.
 */
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }
>>>>>>> di-in-java-config

    @Override
    public String sayGreeting() {
        return "Hello World :: I18nEnglishGreetingService.class";
    }
}
