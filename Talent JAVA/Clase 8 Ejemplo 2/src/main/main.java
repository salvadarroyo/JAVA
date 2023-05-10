package main;

import aspecto.LogginAspect;
import configuracion.Configuracion;
import org.aspectj.ajdt.internal.compiler.lookup.AnonymousClassCreationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import calculadora.calculadora;

public class main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
        contexto.register(Configuracion.class);
        contexto.scan("calculadora", "aspecto");
        contexto.refresh();

        calculadora calculadora = contexto.getBean(calculadora.class);
        int resultado1 = calculadora.sumar(10, 10);
        System.out.println("El resultado de la suma es: " + resultado1);
        int resultado2 = calculadora.restar(15, 10);
        System.out.println("El resultado de la resta es: " + resultado1);
        int resultado3 = calculadora.multiplicacion(10, 10);
        System.out.println("El resultado de la multiplicacion es: " + resultado1);
        int resultado4 = calculadora.division(20, 2);
        System.out.println("El resultado de la division es: " + resultado1);
    }
}
