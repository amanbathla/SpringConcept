package configuration;

import com.springPractice.Mobile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Mobile.class})
public class AppConfig {

//
//    @Bean
//    public Mobile getMobile(){
//        return new Mobile();
//    }


}
