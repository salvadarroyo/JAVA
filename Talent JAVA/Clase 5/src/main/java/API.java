import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class API{
    public static void main(String[] args){
        try{
            URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=28.04&longitude=-16.57&hourly=temperature_2m");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.connect();  //Establece la conexión
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
                System.out.println(informacion);
                JSONObject data = new JSONObject(informacion.toString());   //lo convertimos a String para hacer el .get();
                System.out.println("La latitud es: " + data.get("latitude"));

                data.remove("latitude");
                data.remove("generationtime_ms");
                data.remove("timezone_abbreviation");
                System.out.println(data);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }
}
