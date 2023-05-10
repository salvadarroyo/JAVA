package aspecto;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class logginAspect{
    @Before("execution (public void registro())")
    public void infoLogin(JoinPoint joinPoint){
        System.out.println("Ejecutando metodo: " + joinPoint.getSignature().getName());

    }
    @Around("execution (public void registro())")
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("Latencia: " + (endTime - startTime));
        return result;
    }
    @After("execution (public void registro())")
    public void informo(){
        String username = System.getProperty("user.name");
        System.out.println("El usuario que ha ejecutado el programa es: "+ username);
    }
}
