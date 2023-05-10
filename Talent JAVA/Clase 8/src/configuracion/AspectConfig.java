package configuracion;

import aspecto.TimeLoggerAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("funcion")
public class AspectConfig{
    @Bean
    public TimeLoggerAspect timeLoggerAspect(){
        return new TimeLoggerAspect();
    }
}
