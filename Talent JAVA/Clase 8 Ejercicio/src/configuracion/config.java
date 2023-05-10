package configuracion;

import aspecto.logginAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("funcion")
@EnableAspectJAutoProxy
public class config {
    @Bean
    public logginAspect logginAspect(){
        return new logginAspect();
    }
}
