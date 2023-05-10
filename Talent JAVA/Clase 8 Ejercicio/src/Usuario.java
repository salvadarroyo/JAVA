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
        LocalDate fecha_actual = LocalDate.now();

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
            reg.registro();
            int edad = fecha_actual.getYear() - usuarios[i].fecha_nacimiento.getYear();
            System.out.println("La edad de " + usuarios[i].nombre + " es " + edad);
            i++;

        }while(i < numUsuarios);
        context.close();
    }
}
