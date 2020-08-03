package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("En")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String SayGreeting() {
        return "Hello World - English";
    }
}