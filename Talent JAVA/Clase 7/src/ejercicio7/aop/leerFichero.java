package ejercicio7.aop;

import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Component
public class leerFichero {
    public void leerfichero(){
        try {
            String ruta = "C:\\Users\\sdarroyo\\Documents\\FICHERO_AOP.txt";
            File archivo = new File(ruta);
            String cadena;
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            Set<String> palabra = new HashSet<String>();
            while ((cadena = br.readLine()) != null){
                palabra.add(cadena);
            }
            System.out.println(palabra);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
