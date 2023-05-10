import java.io.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Vuelo extends Empresa{
    String nombre_vuelo;
    int pasajeros;
    String tipo;
    double valor_unitario;
    String fecha_vuelo;

    String Rentabilidad;

    public static void main(String[] args){
        Empresa Iberia = new Empresa();
        double recaudacion_total = 0;
        Iberia.nombre = "Iberia";
        Vuelo[] vuelos = new Vuelo[8];
        try{
            String ruta = "C:\\Users\\sdarroyo\\Documents\\INFO_VUELOS.txt";
            File archivo = new File(ruta);
            String cadena;
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            cadena = br.readLine();
            while ((cadena = br.readLine()) != null){
                String[] palabra = cadena.split("\t\t");

                //System.out.println(palabra[0] + " " + palabra[1] + " " + palabra[2] + " " + palabra[3] + " " + palabra[4]);

                for(int i = 0; i < vuelos.length; i++){
                    vuelos[i] = new Vuelo();
                    vuelos[i].nombre_vuelo = palabra[0];
                    vuelos[i].pasajeros = Integer.parseInt(palabra[1]);
                    vuelos[i].tipo = palabra[2];
                    vuelos[i].valor_unitario = Double.parseDouble(palabra[3]);
                    vuelos[i].fecha_vuelo = palabra[4];

                    double valorFinal = vuelos[i].valor_unitario * vuelos[i].pasajeros;

                    if(vuelos[i].tipo.equals("ECONOMICO") && valorFinal > 100){
                        vuelos[i].Rentabilidad = "Rentable";
                    }
                    else if(vuelos[i].tipo.equals("ECONOMICO") && valorFinal < 100){
                        vuelos[i].Rentabilidad = "NO Rentable";
                    }
                    else if(vuelos[i].tipo.equals("PREMIER") && valorFinal > 1500){
                        vuelos[i].Rentabilidad = "Rentable";
                    }
                    else if(vuelos[i].tipo.equals("PREMIER") && valorFinal < 1500){
                        vuelos[i].Rentabilidad = "NO Rentable";
                    }
                    else{
                        vuelos[i].Rentabilidad = "A CONFIRMAR";
                    }
                    recaudacion_total += valorFinal;
                }
            }
            System.out.println(recaudacion_total);
            br.close();
        } catch(IOException e){
            e.printStackTrace();
        }

        try {
            String ruta2 = "C:\\Users\\sdarroyo\\Documents\\";
            String nombreArchivo = "INFO_VUELOS_ACT.txt";
            String ruta_nombreArchivo = ruta2 + nombreArchivo;
            File archivo2 = new File(ruta_nombreArchivo);
            if (!archivo2.exists()){
                archivo2.createNewFile();
                System.out.println("Se creo el fichero");
                System.out.println(vuelos.length);
                FileWriter fw = new FileWriter(archivo2);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("NOMBRE_VUELO\t\tCANT_PASAJEROS\t\tTIPO_PASAJE\t\tVALOR_UNITARIO\t\tFECHA_VUELO\t\tRENTABILIDAD");
                for(int j = 0; j < vuelos.length; j++){
                    bw.write(vuelos[j].nombre_vuelo + "\t\t" + vuelos[j].pasajeros +  "\t\t" + vuelos[j].tipo +  "\t\t" + vuelos[j].valor_unitario + "\t\t" + vuelos[j].fecha_vuelo + vuelos[j].Rentabilidad);
                    bw.write((int) recaudacion_total);
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
