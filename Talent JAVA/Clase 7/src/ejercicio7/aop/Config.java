package ejercicio7.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ejercicio7")
@EnableAspectJAutoProxy
public class Config {
}
