import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Recetas extends Ingredientes implements Funciones{
    String nombre;
    int num_ingredientes;
    double tiempo_coccion;
    int calorias;
    String tipo;

    @Override
    public double tiempo_coccion(){
        return num_ingredientes;
    }

    @Override
    public int calorias() {
        return num_ingredientes * 3;
    }

    public static void main(String[] args){
        int contador = 0;
        try {
            String ruta = "C:\\Users\\sdarroyo\\Documents\\comida.txt";
            File archivo = new File(ruta);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            int contadorRecetas = 0;
            String cadena;
            while ((cadena = br.readLine()) != null) {
                if (cadena.startsWith("Nombre de la receta:")) {
                    contadorRecetas++;
                }
            }
            contador = contadorRecetas;

        }catch(IOException e){
                e.printStackTrace();
        }

        Recetas[] recetas = new Recetas[contador];
        for (int i = 0; i < contador; i++) {
            recetas[i] = new Recetas();
        }
        try{
            String ruta = "C:\\Users\\sdarroyo\\Documents\\comida.txt";
            File archivo = new File(ruta);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            String cadena2;
            while ((cadena2 = br.readLine()) != null){
                if (cadena2.startsWith("Nombre de la receta:")){
                    recetas[i].nombre = cadena2.substring(21);
                    if (recetas[i].num_ingredientes > 0){
                        System.out.println("La receta anterior tenía " + recetas[i].num_ingredientes + " ingredientes.");
                    }
                    recetas[i].num_ingredientes = 0;
                }
                else if (cadena2.trim().isEmpty()) {
                    i++;
                }
                else{
                    recetas[i].num_ingredientes++;
                }
            }
            for(int j = 0; j < contador; j++){
                recetas[j].tiempo_coccion = recetas[j].tiempo_coccion();
                System.out.println("El tiempo de coccion de la receta " + recetas[j].nombre + " es de " + recetas[j].tiempo_coccion + " min.");
                recetas[j].calorias = recetas[j].calorias();
                System.out.println("El número de calorias de la receta " + recetas[j].nombre + " es de " + recetas[j].calorias + " cal.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
