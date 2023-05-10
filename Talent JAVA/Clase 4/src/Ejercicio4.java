/*Mediante el uso de JFrame, JLabel, JButton y JPanel generar un programa que muestre la siguiente informacion:
    - Un paisaje de tu ciudad
    - Informacion relevante sobre la misma, como por ejemplo:
        ! Mensaje de bienvenida
        ! Cantidad de habitantes
        ! Actividad economica por default.
FORMATO DE FUENTE:
- La fuente debe estar en un tono gris oscuro u otro tono que
  no sea el negro por default.
- El programa debe tener un ancho de 1200 y un alto de 800
ENTREGABLES:
- Codigo del proyecto.
*/


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class Ejercicio4{
    public static void main(String[] args){
        JFrame ventana = new JFrame("Esta es mi ciudad");
        JLabel etiqueta = new JLabel();
        etiqueta.setOpaque(true);
        etiqueta.setForeground(Color.BLUE);
        etiqueta.setHorizontalAlignment(JLabel.LEFT);
        etiqueta.setVerticalAlignment(JLabel.BOTTOM);

        try{
            URL url = new URL("https://s1.abcstatics.com/media/MM/2020/06/28/s/ambiente-playa-muralla-puerto-santa-maria-(12)_xoptimizadax-k7qD--1248x698@abc.jpg");
            Image imagen = ImageIO.read(url);
            etiqueta.setIcon(new ImageIcon(imagen));
        }
        catch(IOException e){
            e.printStackTrace();
        }

        JPanel panel = new JPanel();
        JButton boton = new JButton("Mostrar informacion");
        boton.setHorizontalAlignment(JButton.RIGHT);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoBoton = e.getActionCommand();
                etiqueta.setText("<html>Esta es mi ciudad, El Puerto de Santa María (Cádiz).<br> Actualmente tiene 88.430 habitantes aunque en verano supera los 120.000. <br> Esta subida de habitantes se debe al turismo por las playas y la fiesta.<html>");
                /*
                Para escribirlo en consola
                System.out.println("Esta es mi ciudad, El Puerto de Santa María (Cádiz)");
                System.out.println("Actualmente tiene 88.430 habitantes aunque en verano supera los 120.000.");
                System.out.println("Esta subida de habitantes se debe al turismo por las playas y la fiesta.");
                 */
            }
        });

        panel.add(etiqueta);
        panel.add(boton);
        ventana.add(panel);
        ventana.setSize(2000,800);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}