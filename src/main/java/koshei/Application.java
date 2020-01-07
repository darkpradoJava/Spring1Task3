package koshei;

import koshei.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Koshei koshei = applicationContext.getBean(Koshei.class);
        System.out.println(koshei.getRulesByDeth());

    }

}
