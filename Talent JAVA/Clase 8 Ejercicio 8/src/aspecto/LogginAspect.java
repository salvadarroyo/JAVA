package aspecto;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogginAspect{

    @Around("execution (public void registro())")
    public void infoLogin(JoinPoint joinPoint){
        System.out.println("Ejecutando metodo: " + joinPoint.getSignature().getName());
    }
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("Latencia: " + (endTime - startTime));
        return result;
    }
    public void informo(){
        String username = System.getProperty("user.name");
        System.out.println("El usuario que esta ejecutando el programa es: "+ username);
    }
}
