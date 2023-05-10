package es.pildoras.dao;

import es.pildoras.aop1.Configuracion;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import es.pildoras.aop1.ClienteDAO;

public class main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
        //Con la linea 7 declaramos el contexto para poder hacer uso
        //a la funcionalidad
        ClienteDAO elCliente = contexto.getBean("ClienteDAO", ClienteDAO.class);
        //Con la linea 10 instanciamos a elCliente y accedemos a través del BEAN
        //a las funcionalidades que tenga almacenado ClienteDAO
        elCliente.saludar();
        contexto.close();
    }
}
