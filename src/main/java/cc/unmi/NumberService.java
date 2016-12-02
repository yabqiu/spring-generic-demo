package cc.unmi;

import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import java.lang.reflect.ParameterizedType;

@Named
@Profile({"Number", "Both"})
public class NumberService<R extends Number> implements Service<R>{

    @PostConstruct
    @SuppressWarnings("unchecked")
    public void instanceCreated() {
        System.out.println(new NumberService<R>().process((R)Integer.valueOf("200")));
        System.out.println(new NumberService<>().process(300));
        System.out.println("NumberService created.");
    }

    @Override
    public String process(R number) {
        return "Process Number: " + number;
    }
}
