/*
Ejercicio 14 (tiene nota):
Estamos trabajando en Spotify y nuestro gerente de marketing nos solicito que generemos un
programa para contabilizar la siguiente información de los artistas (a traves de la consola)
- Nombre Artista
- Genero
- Cantidad de Reproducciones
- Pais donde mas se escucha
Agregar en base a esto:
- Recaudacion monetaria
- Proyeccion anual
La recaudación monetaria y la proyección anual deben ser calculadas a traves del uso de
Interfaces.
recaudación monetaria = Cantidad de reproducciones * 0.02
Proyeccion anual = recaudacion monetaria * 12
ACCIONES:
- Convertir el proyecto en proyecto de Maven y colgarlo en Jenkins para realizar la generación del jar file.
- Generar un TXT con la información que genere el programa
ENTREGABLES:
- Captura de la consola de Jenkins con los comandos de Maven ejecutados
- Link del repositorio en Github.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Spotify implements Calculos{
    String nombre;
    String genero;
    int reproducciones;
    String pais_oyentes;
    public double calcularRecaudacion(){
        return reproducciones * 0.02;
    }

    public double calcularProyeccionAnual(){
        return calcularRecaudacion() * 12;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("¿Cuántos artistas desea ingresar?");
        int num = sc.nextInt();
        Spotify[] artistas = new Spotify[num];

        for(int i = 0; i < num; i++){
            artistas[i] = new Spotify();
            System.out.println("Nombre: ");
            artistas[i].nombre = sc.next();
            System.out.println("Genero: ");
            artistas[i].genero = sc.next();
            System.out.println("Reproducciones: ");
            artistas[i].reproducciones = sc.nextInt();
            System.out.println("Pais donde mas se escucha: ");
            artistas[i].pais_oyentes = sc.next();
        }

        try{
            String ruta = "C:\\Users\\sdarroyo\\Documents\\";
            String nombreArchivo = "Spotify.txt";
            String ruta_nombreArchivo = ruta + nombreArchivo;
            File archivo = new File(ruta_nombreArchivo);
            FileWriter fw = new FileWriter(archivo);
            for(int j = 0; j < num; j++){
                fw.write("Nombre: " + artistas[j].nombre + "\n");
                fw.write("Genero: " + artistas[j].genero + "\n");
                fw.write("Reproducciones: " + artistas[j].reproducciones + "\n");
                fw.write("Pais donde mas se escucha: " + artistas[j].pais_oyentes + "\n");
                fw.write("Recaudacion monteraia: " + artistas[j].calcularRecaudacion() + "\n");
                fw.write("Proyeccion anual: " + artistas[j].calcularProyeccionAnual() + "\n");
                fw.write("---------------------------------------------------------" + "\n");
            }
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
