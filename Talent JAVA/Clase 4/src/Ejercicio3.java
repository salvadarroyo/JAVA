//Ejercicio 3:
//En base al siguiente TXT debe leer todas las lineas del mismo remover los duplicados utilizando la Colección Set e informarlo por consola.

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio3{
    public static void main(String[] args){
        Set<String> nombres = new HashSet<>();
        try{
            String ruta = "C:\\Users\\sdarroyo\\Documents\\Nombres.txt";
            File archivo = new File(ruta);
            String cadena;
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((cadena = br.readLine()) != null){
                nombres.add(cadena);
            }
            br.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}