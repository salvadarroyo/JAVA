//AOP: Aspect Oriented Programming
//Programacion orientada a aspectos

/*
La programacion orientada a aspectos aplica Modularidad
en aspectos TRANSVERSALES
¿Qué es la transversalidad en Java?
Son situaciones que involucran al codigo como un TODO.
Como por ejemplo:
    - Registro de auditoría
    - Seguridad de la aplicación
    - Gestion de excepciones

A la hora de trabajar con AOP se modulan las clases y el
codigo en distintos archivos.

Aspectos: es un modulo que encapsula una funcionalidad TRANSVERSAL
que afecta a multiples puntos de la aplicación como
la seguridad, resigstaciones, validaciones, ejemplos de
transacciones, etc.

    - Un aspecto puede definir un PUNTO DE CORTE
    ¿Qué es un punto de corte?
    Son los lugares de la aplicación deonde se va a añadir la
    nueva funcionalidad encapsulada.

    - Los aspectos FACILITAN la implementación de requisitos no
    funcionales en una aplicación.

    Los aspectos se identifican con la siguiente notación.
    @Aspect

    Anotaciones (metodos):
Las anotaciones en AOP son etiquetas que se colocan sobre
elementos de codigo, como por ejemplo, clases,
atributos, parametros, etc. Y que propocione información
adicional sobre los aspectos, como por su alcance, su orden
de ejecución, entre otros.
Las anotaciones se utilizan para definir los aspectos de

@After: Se va a ejecutar luego del aspecto
@Before: Se va a ejecutar ANTES del aspecto
@Around: Se va a ejecutar a posterior si se da un

Servicios:
En el contexto de AOP un servicio es una clase que
provee ciertas fucnionalidades a la aplicación.
Un servicio puede ser CUALQUIER objeto que tenga una
responsabilidad específica dentro de la aplicación, como acceder
a la base de datos, procesar datos, enviar correos
electrónicos...

En general los servicios son una parte importante de la
aplicación, ya que son los responsables del negocio y
proporcionar las funcionaledades requeridas por los clientes
de la aplicación.

BEAN:
Es un objeto instanciado, configurado y manejado por el
contenedor de Spring. Los beans son las unidades basicas
de la aplicación de Spring y son responsables
 */

public class AOP {
    public static void main(String[] args){

    }
}
