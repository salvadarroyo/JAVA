import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;
import java.util.Scanner;

public class Empleado extends Persona implements iSalario{
    public double calcularSalario(){
        return sueldo * 0.8;
    }
    String posicion;
    double sueldo;
    LocalDate fecha_ingreso;
    public static void main(String[] args){

        //podría haber hecho directamente
        //Empleado[] empleados = new Empleado[3];
        //empleado[0].nombre = "Salva";
        //empleado[1].nombre = "Gustavo";

        Empleado salva = new Empleado();
        salva.nombre = "Salva";
        salva.apellido = "Delgado";
        salva.ciudad = "Madrid";
        salva.edad = 25;

        Empleado gustavo = new Empleado();
        gustavo.nombre = "Gustavo";
        gustavo.apellido = "Vargas";
        gustavo.ciudad = "Barcelona";
        gustavo.edad = 30;

        Empleado javier = new Empleado();
        javier.nombre = "Javier";
        javier.apellido = "Aviles";
        javier.ciudad = "Murcia";
        javier.edad = 24;

        Empleado[] empleados = new Empleado[3];
        empleados[0] = salva;
        empleados[1] = gustavo;
        empleados[2] = javier;

        int i = 0;

        for(i = 0; i < empleados.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la siguiente información del empleado " + empleados[i].nombre + " " + empleados[i].apellido);

            System.out.print("Posicion: ");
            empleados[i].posicion = sc.next();
            System.out.println();
            System.out.print("Salario: ");
            empleados[i].sueldo = sc.nextDouble();
            empleados[i].sueldo = empleados[i].calcularSalario();
            System.out.println();
            System.out.println("Fecha de ingreso: ");
            System.out.println("Anio: ");
            int anio = sc.nextInt();
            System.out.println("Mes: ");
            int mes = sc.nextInt();
            System.out.println("Día: ");
            int dia = sc.nextInt();
            empleados[i].fecha_ingreso = LocalDate.of(anio,mes,dia);
            System.out.println();
        }
        LocalDate fecha_actual = LocalDate.now();

            try {
                String ruta = "C:\\Users\\sdarroyo\\Documents\\";
                //String ruta2 = "C:\\Users\\sdarroyo\\Documents\\informacion_empleados_fechaDeHoy.txt";
                String nombreArchivo = "informacion_empleados_fechaDeHoy.txt";
                String ruta_nombreArchivo = ruta + nombreArchivo;
                File archivo = new File(ruta_nombreArchivo);
                if (!archivo.exists()){
                    archivo.createNewFile();
                    System.out.println("Se creo el fichero");
                    FileWriter fw = new FileWriter(archivo);
                    BufferedWriter bw = new BufferedWriter(fw);
                    for(int j = 0; j < empleados.length; j++){
                        bw.write("Nombre: " + empleados[j].nombre);
                        bw.write("\n");
                        bw.write("Apellido: " + empleados[j].apellido);
                        bw.write("\n");
                        bw.write("Edad: " + empleados[j].edad);
                        bw.write("\n");
                        bw.write("Ciudad: " + empleados[j].ciudad);
                        bw.write("\n");
                        bw.write("Posicion: " + empleados[j].posicion);
                        bw.write("\n");
                        bw.write("Sueldo: " + empleados[j].sueldo);
                        bw.write("\n");
                        bw.write("Fecha Ingreso: " + empleados[j].fecha_ingreso);
                        bw.write("\n\n");
                    }
                    bw.write("Fecha: " + fecha_actual);
                    bw.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
    }
}
