package koshei.config;

import koshei.model.Egg6;
import koshei.model.Island2;
import koshei.model.Needle7;
import koshei.model.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koshei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Egg6 getEgg(Needle7 needle) {
        return new Egg6(needle);
    }

}
