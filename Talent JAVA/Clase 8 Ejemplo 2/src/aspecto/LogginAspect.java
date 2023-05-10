package aspecto;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect{
    @Before("execution (* calculadora.calculadora.*(..))")
    public void logMetodCall(JoinPoint joinPoint){
        System.out.println("Ejecutando metodo: " + joinPoint.getSignature().getName());
    }

    @After("execution (* calculadora.calculadora.*(..))")
    public void informo(){
        System.out.println("El metodo finalizo");
    }

    //execution(public int calculadora.calculadora.sumar(int,int)):
    //cuando se ejecute el metodo sumar

    //execution(* paquete.Clase,metodoPublico()):
    //apunta a cualquier metodo publico en la clas "Clase" que no tenga
    //parametros y no especifica el tipo de retorno.

    //execution(public void com.ejemplo.Clase.metodoVoid()) apunta al metodo
    //publico 'metodoVoid()' en la clase 'Clase' que no tiene parametros
    //y no devuelve nada.

    //execution(* com.ejemplo.Clase.metodoConParametros(*)):
    //metodo de la clase 'Clase' que tenga un solo parametro de cualquier

    //execution( * com.Ejemplo.Clase.MetodoConVariosParametros(..))
    //apunta a cualquier metodo publico de la clase 'Clase' que tenga cualquier
    //numero de parametros de

    //execution(public * com.ejemplo.Clase.metodoQueDevuelvePUblico()):
    //apunta a cualquier metodo publico en la clase 'Clase' que devuelve cualquier tipo.

    //execution(* com.ejemplo.Clase.*())
    //apunta a cualquier metodo en la clase 'Clase' que no
    //tenga parametros y no especifica el tipo de retorno.

}
