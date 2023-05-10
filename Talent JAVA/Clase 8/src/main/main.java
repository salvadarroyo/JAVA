package main;

import configuracion.AspectConfig;
import funcion.Funcion;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main{
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        Funcion funcion = context.getBean(Funcion.class);
        System.out.println("Resultado de la suma: " + funcion.sumar(10,10));
        System.out.println("Resultado de la suma: " + funcion.sumar(15000, 18000));
        System.out.println("Resultado de la suma: " + funcion.sumar(14578000, 19875000));
        context.close();
    }
}
