/*
EJERCICIO 5:
Generar un programa de tipo Maven que declare lo siguiente:
    * 3 objetos de tipo JSON que contengan la siguiente iformación para los empleados de la empresa:
        - Nombre
        - Apellido
        - Ciudad
        - Edad
        - Email

    * Luego, insertarlos a traves de un array. Mostrarlo por consola.
 */

import org.json.*;

public class Ejercicio5 {
    public static void main(String[] args){
        JSONObject empleado1 = new JSONObject();
        empleado1.put("Nombre", "Salva");
        empleado1.put("Apellido", "Delgado");
        empleado1.put("Ciudad", "Madrid");
        empleado1.put("Edad", "25");
        empleado1.put("Email", "sdarroyo@indra.es");

        JSONObject empleado2 = new JSONObject();
        empleado2.put("Nombre", "Gustavo");
        empleado2.put("Apellido", "Vargas");
        empleado2.put("Ciudad", "Barcelona");
        empleado2.put("Edad", "30");
        empleado2.put("Email", "gavargas@grupoloyal.com");

        JSONObject empleado3 = new JSONObject();
        empleado3.put("Nombre", "Pablo");
        empleado3.put("Apellido", "Calle");
        empleado3.put("Ciudad", "Sevilla");
        empleado3.put("Edad", "25");
        empleado3.put("Email", "pcalle@indra.es");

        JSONArray empleados = new JSONArray();
        empleados.put(empleado1);
        empleados.put(empleado2);
        empleados.put(empleado3);

        System.out.println(empleados);
    }
}
