import javax.swing.*;
import java.awt.*;

public class Ejemplo3{
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Esta es mi ventana");
        JLabel etiqueta = new JLabel("Esta es mi etiqueta");
        etiqueta.setOpaque(true);
        etiqueta.setForeground(Color.WHITE);        //Cambia el color de la fuente
        etiqueta.setBackground(Color.DARK_GRAY);       //Le agrega un color de fondo
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        ventana.add(etiqueta);
        ventana.setVisible(true);
        ventana.setSize(250, 150);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
