package es.pildoras.aop1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("es.pildoras.aop.aspectos")
@EnableAspectJAutoProxy
public class Configuracion {

}
