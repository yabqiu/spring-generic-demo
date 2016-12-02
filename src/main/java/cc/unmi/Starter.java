package cc.unmi;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Starter<T> {

    @Inject
    private Service<T> service;

    @PostConstruct
    @SuppressWarnings("unchecked")
    public void start() {
        if(service.getClass() == StringService.class) {
            System.out.println(service.process((T)"Hello Spring!"));
        } else {
            System.out.println(service.process((T) Integer.valueOf("10000")));
        }
    }
}
