import javax.swing.*;
import java.awt.*;

public class Ejemplo2{
    public static void main(String[] args){
        JFrame ventana = new JFrame("Otro ejemplo");
        ImageIcon icono = new ImageIcon("C:\\Users\\sdarroyo\\Documents\\icono.png");
        ImageIcon icono_arreglado = new ImageIcon(icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        //Con icono_arreglado puedo dejar mas bonito el icono y darle un formato
        //preestablecido
        //icono.getImage() obtiene la imagen asociada al icono
        //.getScaledInstance necesita 3 parametros como minimo:
        //  - el tamaño del icono
        //  - que accion se va a realizar sobre la imagen: en este caso fue SCALE_SMOOT que suaviza la imagen

        JLabel etiqueta = new JLabel("Este es mi programa!", icono_arreglado, JLabel.CENTER);
        ventana.add(etiqueta);
        ventana.setSize(400,400);   //ancho x alto
        ventana.setVisible(true);                   //por default esta seteado en FALSE

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
