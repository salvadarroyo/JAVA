import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Declaro la clase calculadora que extiende de JFrame e implementa ActionListener
public class Calculadora extends JFrame implements ActionListener {

    //Qué hace ActionListener? ActionListener se encarga de capturar
    //los eventos que ocurren en los botones de la calculadora.
    JLabel pantalla;
    double resultado = 0;
    String operacion = "";
    boolean nuevaOperacion = true;

    public Calculadora() {  //Declaramos el constructor de la calculadora
        setTitle("Mi calculadora");     //configuro el titulo
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);    //Para que se pueda ajustar o no el tamaño (en este caso no se puede ajustar)

        //Creo la pantalla
        pantalla = new JLabel("0"); //es lo que se ve por defecto al encender la calculadora
        pantalla.setHorizontalAlignment(JLabel.RIGHT);  //Decimos que la etiqueta se situe a la derecha
        pantalla.setPreferredSize(new Dimension (300,200));
        add(pantalla, BorderLayout.NORTH);

        //Creo los botones a asignar
        String[]  nombreBotones = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "-", "*", "/", "="};
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4,4));     //indica como se distribuye cada elemento
                                                                    //en el panel, en este caso 4x4

        for(int i = 0; i < nombreBotones.length; i++){
            JButton boton = new JButton(nombreBotones[i]);
            boton.addActionListener(this);
            panelBotones.add(boton);
        }

        add(panelBotones, BorderLayout.CENTER);     //agrego los botones
        setVisible(true);                           //Establezco que la pantalla este visible
    }

    //Este metodo es el encargado de realizar la accion asociada a cada boton
    public void actionPerformed(ActionEvent e){
        String textoBoton = e.getActionCommand();       //El metodo getActionCommand obtiene
        if(textoBoton.equals("0") || textoBoton.equals("2") || textoBoton.equals("3")
           || textoBoton.equals("4") || textoBoton.equals("5") || textoBoton.equals("6")
           || textoBoton.equals("7") || textoBoton.equals("8") || textoBoton.equals("9")){
            if(nuevaOperacion){
                pantalla.setText(textoBoton);
                nuevaOperacion = false;
            }
            else{
                pantalla.setText(pantalla.getText() + textoBoton);
            }
        }
        else if(textoBoton.equals("+") || textoBoton.equals("-")
                || textoBoton.equals("*") || textoBoton.equals("/")){
            if(!operacion.equals("")){
                caclular();
            }
            operacion = textoBoton;
            resultado = Double.parseDouble(pantalla.getText());
            nuevaOperacion = true;
        }
        else if(textoBoton.equals("=")){
            caclular();
            operacion = "";
            nuevaOperacion = true;
        }
    }

    public void caclular(){
        if(operacion.equals("+")){
            resultado += Double.parseDouble(pantalla.getText());
        }
        else if(operacion.equals("-")){
            resultado -= Double.parseDouble(pantalla.getText());
        }
        else if(operacion.equals("*")){
            resultado *= Double.parseDouble(pantalla.getText());
        }
        else if(operacion.equals("/")){
            resultado /= Double.parseDouble(pantalla.getText());
        }
        pantalla.setText("" + resultado);
    }

    public static void main(String[] args){
        Calculadora calc = new Calculadora();
    }
}
