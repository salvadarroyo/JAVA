import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio12 implements Ciudades{
    String ciudad;
    int poblacion_parcial;

    public double calcularPoblacion(){
        return poblacion_parcial * 0.8;
    }

    public static void main(String[] args)  throws IOException{

        Ejercicio12[] ciudades = new Ejercicio12[4];

        for(int i = 0; i < ciudades.length; i++){
            ciudades[i] = new Ejercicio12();
        }

        ciudades[0].ciudad = "Barcelona";
        ciudades[0].poblacion_parcial = 100000;

        ciudades[1].ciudad = "Madrid";
        ciudades[1].poblacion_parcial = 1000000;

        ciudades[2].ciudad = "Malaga";
        ciudades[2].poblacion_parcial = 50000;

        ciudades[3].ciudad = "Sevilla";
        ciudades[3].poblacion_parcial = 80000;

        String contenidoJenkinsFile =
                        "pipeline {\n" +
                        "    agent any\n" +
                        "    stages {\n" +
                        "        stage('Barcelona') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    echo 'La poblacion total de " + ciudades[0].ciudad + " es " + ciudades[0].calcularPoblacion() + ")'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "        stage('Madrid') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    echo 'La poblacion total de " + ciudades[1].ciudad + " es " + ciudades[1].calcularPoblacion() + ")'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "        stage('Malaga') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    echo 'La poblacion total de " + ciudades[2].ciudad + " es " + ciudades[2].calcularPoblacion() + ")'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "        stage('Sevilla') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    echo 'La poblacion total de " + ciudades[3].ciudad + " es " + ciudades[3].calcularPoblacion() + ")'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "    }\n" +
                        "}";

        try (PrintWriter writer = new PrintWriter(new FileWriter("Jenkinsfile"))) {
            writer.write(contenidoJenkinsFile);
            System.out.println("Se genero el Jenkinsfile");
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }
}
