package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpnaishHolaMunda implements GreetingService{

    @Override
    public String sayHello() {
        return "Spanish wali";
    }


}
