package cc.unmi;

import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;
import javax.inject.Named;

@Named
@Profile({"String", "Both"})
public class StringService implements Service<String> {

    @PostConstruct
    @SuppressWarnings("unchecked")
    public void instanceCreated() {
        System.out.println("StringService created.");
    }

    @Override
    public String process(String string) {
        return "Process String: " + string;
    }
}
