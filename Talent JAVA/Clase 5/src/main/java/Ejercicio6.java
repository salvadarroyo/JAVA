/*
EJERCICIO 6
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){
        JFrame ventana = new JFrame("Fotos de gatos");
        JLabel etiqueta = new JLabel();
        JPanel panel = new JPanel();
        JButton boton = new JButton("Recargar");
        try{
            URL url = new URL("https://api.thecatapi.com/v1/images/search");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.connect();  //Establece la conexión
            int tiempoDeRespuesta = con.getResponseCode();
            if(tiempoDeRespuesta != 200){
                throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);
            }
            else{
                StringBuilder informacion = new StringBuilder();
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    informacion.append(sc.nextLine());
                }
                sc.close();

                JSONArray data = new JSONArray(informacion.toString());

                for (int i = 0; i < data.length(); i++){
                    JSONObject jsonObject = data.getJSONObject(i);
                    System.out.println(jsonObject.get("url"));
                    URL pagina = new URL((String) jsonObject.get("url"));
                    Image imagen = ImageIO.read(pagina);
                    etiqueta.setIcon(new ImageIcon(imagen));

                    boton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            etiqueta.setIcon(new ImageIcon(imagen));
                        }
                    });
                }

            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

        panel.add(etiqueta);
        panel.add(boton);
        ventana.add(panel);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
