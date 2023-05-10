package ejercicio7;/*
EJERCICIO 7:
Generar un programa que aplique la programación orientada a Aspectos en el codigo
y que al momento de leer el fichero informe un mensaje por consola que inidque se
esta por leer el fichero.
Luego, mostrar la informacion del fichero en la consola
quitando duplicados haciendo uso de la colección SET.
 */

import es.pildoras.aop1.ClienteDAO;
import es.pildoras.aop1.Configuracion;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ejercicio7.aop.Config;
import ejercicio7.aop.leerFichero;

public class Ejercicio7 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Config.class);
        //Con la linea 7 declaramos el contexto para poder hacer uso
        //a la funcionalidad
        leerFichero elCliente = contexto.getBean("leerFichero", leerFichero.class);
        //Con la linea 10 instanciamos a elCliente y accedemos a través del BEAN
        //a las funcionalidades que tenga almacenado ClienteDAO
        elCliente.leerfichero();
        contexto.close();
    }
}
