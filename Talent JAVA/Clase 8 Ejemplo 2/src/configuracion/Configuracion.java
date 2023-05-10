package configuracion;

import aspecto.LogginAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Configuracion{
    @Bean
    public LogginAspect LogginAspect(){
        return new LogginAspect();
    }
}
