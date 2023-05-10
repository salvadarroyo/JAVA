package es.pildoras.aop1;

import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {
    public void saludar(){
        System.out.println("Hola! Te saludo!");
    }
}
