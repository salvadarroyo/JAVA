import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class Ejemplo4{
    public static void main(String[] args){
        JFrame ventana = new JFrame("Este es mi programa");
        JLabel etiqueta = new JLabel();

        try{
            URL url = new URL("https://tripkay.com/destination-guides/wp-content/uploads/2016/03/Ciudad-Cadiz-Costa-de-la-Luz-Andalucia.jpg");
            Image imagen = ImageIO.read(url);
            etiqueta.setIcon(new ImageIcon(imagen));
        }
        catch(IOException e){
            e.printStackTrace();
        }

        JPanel panel = new JPanel();
        JButton boton = new JButton("Saludar");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bienvenid@ a mi ciudad!");
            }
        });

        panel.add(etiqueta);
        panel.add(boton);
        ventana.add(panel);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
