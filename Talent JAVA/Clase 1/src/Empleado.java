/*Clase public:
Las clases publicas son aquellas que pueden ser reutilizadas en otras clases,
y que por tanto, son accesibles desde distantas partes del codigo.

Clase privada:
En contraposición de la clase pública, las clases privadas son aquellas que SOLO
puede utilizarse dentro del paquete correspondiente a su cuerpo.
que NO son accesibles desde otras partes del codigo, y que al ser de
pueden ser empleadas por otras clases.

Beneficios de las clases privadas:
Encapsulación de funcionalidad: Las clases privadas utilizan el concepto
de encapsulación de funcionalidades dentro de una clase, lo que permite que se mantenga
oculta y protegida del acceso EXTERNO. Esto ayuda a prevenir cambios accidentales
en el estado interno de la clase y garantiza que la clase funcione correctamente.

Abastracción: Las clases privadas se utilizan para proporcionar una capa de abstracción
lo que permite que los detalles de implementación se mantengan ocultos.

Trazabilidad del codigo: La trazabilidad del código es lo que nos permite identificar
de forma rápdia y sencilla que hace cada elemento del proyecto y nos permite
fácilmente identificarlo y modificarlo.

Clase final: Las clases finales son aquellas que designan la FINALIZACIÓN

Clase abstracta: Las clases abstractas son todas aquellas que sirven para integrar
metodos abstractos. Cuando una clase tiene un elemento o método abstracto
es imposible instanciarla. Por el contrario, se hace simplemente la declaración.
public abstract class MiClaseAbstracta{
    public abstract void calculoEdad();
}

Herencia: En java, la herencia es un mecanismo mediante el cual una clase puede HEREDAR
atributos y metodos de otra clase. La clase que hereda los atributos y metodos se
conoce como "subclase" o "clase hija", mientras que la clase de la que se heredan
los atributos y metodos se conoce como "superclase" o "clase padre".
En java no existe herencia múltiple como tal.

Interfaces en Java: El objetivo de una interfaz es declarar una serie de metodos
o atributos sin su implementación. Luego una clase o varias clases puede
IMPLEMENTAR la interfaz.
Una vez que una clase IMPLEMENT una interfaz SE DEBEN IMPLEMENTAR TODOS SUS
METODOS, así estos estén vacíos o no.
*/

public class Empleado extends Persona implements iCalculos /*InterfazX, InterfazY, InterfazZ...*/{
    //puede implementar varias interfaces a la vez
    //una clase tiene que implementar TODOS los métodos de la clase que implemente
    //en este caso, no puedo solo implementar el metodo sumar, tengo que implementarlos TODOS.
    public void sumar(){
        System.out.println("La suma es 10");
    }
    public void restar(){
        System.out.println("La resta es 20");
    }

    public void multiplicar(){

    }

    public void dividir(){

    }
    String cargo;
    int sueldo;
    public static void main(String[] args){
        Empleado salva = new Empleado();
        salva.nombre = "Salva";
        salva.apellido = "Delgado";
        salva.edad = 25;
        salva.ciudad = "Madrid";
        salva.cargo = "Ingeniero Junior";
        salva.sueldo = 24250;
        salva.sumar();
        salva.restar();

        System.out.println("El empleado se llama " + salva.nombre + " " + salva.apellido + " y su cargo es " + salva.cargo +".");
    }
}