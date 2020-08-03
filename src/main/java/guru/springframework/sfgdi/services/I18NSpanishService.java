package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Profile({"Es", "default"})
@Service("i18NService")
public class I18NSpanishService implements GreetingService {

    @Override
    public String SayGreeting() {
        return "Hola mundo - Es";
    }
}
