import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class PokeAPI {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        System.out.println("¿Qué pokemon quieres buscar?");
        String pokemon = s.next();
        try{
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + pokemon);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.connect();
            int tiempoDeRespuesta = con.getResponseCode();
            if(tiempoDeRespuesta != 200){
                throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);
            }
            else {
                StringBuilder informacion = new StringBuilder();
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    informacion.append(sc.nextLine());
                }
                sc.close();
                JSONObject jsonObject = new JSONObject(informacion.toString());
                String nombre = jsonObject.getJSONObject("species").getString("name");
                String tipo = jsonObject.getJSONArray("types").getJSONObject(0).getJSONObject("type").getString("name");
                int peso = jsonObject.getInt("weight");

                System.out.println("Nombre: " + nombre);
                System.out.println("Tipo: " + tipo);
                System.out.println("Peso: " + peso);

                try{
                    String ruta = "C:\\Users\\sdarroyo\\Documents\\";
                    String nombreArchivo = "pokemon.txt";
                    String ruta_nombreArchivo = ruta + nombreArchivo;
                    File archivo = new File(ruta_nombreArchivo);
                    FileWriter fw = new FileWriter(archivo);
                    fw.write("Nombre: " + nombre + "\n");
                    fw.write("Tipo: " + tipo + "\n");
                    fw.write("Peso: " + peso + "\n");
                    fw.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
