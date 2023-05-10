
/*
Ejercicio 8:
Desarrollar un proyecto de tipo Maven basado en Java que implemente
el paradigma de "Programación Orientada a Aspectos", el programa debe cumplir
con la siguiente estructura:
- Debe implementar Clases y herencia
- Debe poder permitir al usuario registrarse solicitandole valores por consola: Nombre, Apellido, nombre de usuario y email, fecha de nacimiento.
- El programa debe calcular la edad de los usuarios
- El programa debe implementar un metodo que se llame registroDeUsuarios() que almacene los usuarios.
Clases: Persona y Usuario con sus respectivos atributos donde Usuario hereda de Persona.
AOP: Cada vez que se registre un usuario, se debe arrojar el nombre de la función que esta implementando dicho metodo y su latencia y ademas de esto,
informar  el ordenador (usando getProperty()) que esta ejecutando el programa
Toda esta información se debe imprimir por pantalla.
ENTREGABLES:
- Codigo del proyecto.
 */
package main;
import java.time.LocalDate;
import java.util.Scanner;

import configuracion.config;
import funcion.registroDeUsuarios;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Usuario extends Persona{
    String nombre_usuario;
    String email;

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        registroDeUsuarios reg = context.getBean("registroDeUsuarios", registroDeUsuarios.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos usuario desea registrar? ");
        int numUsuarios = sc.nextInt();

        Usuario[] usuarios = new Usuario[numUsuarios];
        int i = 0;

        do{
            usuarios[i] = new Usuario();
            System.out.println("Nombre: ");
            usuarios[i].nombre = sc.next();
            System.out.println("Apellido: ");
            usuarios[i].apellido = sc.next();
            System.out.println("Nombre de usuario: ");
            usuarios[i].nombre_usuario = sc.next();
            System.out.println("Email: ");
            usuarios[i].email = sc.next();
            System.out.println("Fecha de nacimiento: ");
            System.out.println("Anio: ");
            int anio = sc.nextInt();
            System.out.println("Mes: ");
            int mes = sc.nextInt();
            System.out.println("Día: ");
            int dia = sc.nextInt();
            usuarios[i].fecha_nacimiento = LocalDate.of(anio,mes,dia);
            i++;
        }while(i < numUsuarios);

        reg.registro();
        context.close();

        LocalDate fecha_actual = LocalDate.now();
        for (int j = 0; j < numUsuarios; j++){
            int edad = fecha_actual.getYear() - usuarios[j].fecha_nacimiento.getYear();
            System.out.println("La edad de " + usuarios[j].nombre + " es " + edad);
        }
    }
}

