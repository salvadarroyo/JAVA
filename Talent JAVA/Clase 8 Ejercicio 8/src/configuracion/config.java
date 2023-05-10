package configuracion;

import aspecto.LogginAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("funcion")
@EnableAspectJAutoProxy
public class config{
    @Bean
    public LogginAspect LogginAspect(){
        return new LogginAspect();
    }
}
