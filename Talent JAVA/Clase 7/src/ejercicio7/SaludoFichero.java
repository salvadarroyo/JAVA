package ejercicio7;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SaludoFichero {
    @Before("execution(public void leerfichero())")
    public void estaPorSaludar(){
        System.out.println("El fichero esta por leer.");
    }
}
