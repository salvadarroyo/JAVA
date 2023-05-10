import javax.swing.*;

public class Clase{
    public static void main(String[] args){
        //Ejemplo 1
        JFrame ventana = new JFrame("Este es mi ejemplo de HolaMundo");
        JLabel etiqueta = new JLabel("Hola mundo!");

        //Inserto la etiqueta dentro de la ventana
        ventana.add(etiqueta);          //Inserto la etiqueta dentro de la ventana
        ventana.setVisible(true);       //le indico que se pueda visualizar
        //ventana.pack();                 //Ajusta la ventana al contenido del mismo
        ventana.setSize(400, 400);  //Ajusto el tamaño de la ventana con lo que yo le indique
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
