/*
Maven es una herramienta de gestión de proyectos de Software de Java y otros
lenguajes de programación. A través del archivo POM se encarga del manejo.
POM: Project Object Mode. Es el encargado de manejar las dependencias,
plugins, tareas de construcción, etc.

Genero una nueva versión donde la actualización tiene nuevas
funcionalidades. Estas nuevas funcionalidades se pueden generar
a través de un archivo de tipo .jar o un archivo de tipo .war.

Qué es un JAR File? Java ARchive es un archivo que contiene uno o varios
archivos Java compilados y otros recursos dentro. Como por ejemplo,
archivos de configuración, imagenes, propiedades, y cualquier otro
archivo NECESARIO para que se ejecute el programa.

Para acceder al contenido del JAR FIle se puede hacer uso de la
consola de Windows a través del comando Java -jar NombreARchivoJarFile.jar

GroupID: ES el ID que identifica quien genero la dependencia. Ya
sea la empresa, la persona, o el nombre del proyecto.

ArtefactID: Es el artefacto que contiene las funcionalidades asociadas
al programa. Problablemente dentro de un .jar o un .war contenido.

JSON: Es un formato de texto sencillo para el intercambio de DATOS.

JSON se usa mucho en el desarrollo de APIS.
 */

import org.json.*;
import com.google.gson.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Clase {
    public static void main(String[] args){

        //Declaracion de un objeto de tipo JSON y un array de tipo JSON
        JSONObject objeto = new JSONObject();
        JSONArray arrayJson = new JSONArray();

        objeto.put("Nombre", "Salva");
        objeto.put("Apellido", "Delgado");
        objeto.put("Edad", 25);

        arrayJson.put(objeto);

        String stringJSON = objeto.toString();

        System.out.println(objeto);
        System.out.println(stringJSON);
        System.out.println(arrayJson);
        //Formato de salida de una archivo de tipo JSON:
        //{"Edad":25,"Apellido":"Delgado","Nombre":"Salva"}

        System.out.println("--------------------------------------------------------");

        //Leer JSON
        //String cadenaDeCaracteres = "{\"nombre\", \"Salva\", \"apellido\", \"Delgado\", \"edad\", \"25\"}";
        //JSONObject json_objeto = new JSONObject(cadenaDeCaracteres);

        String cadenaDeCaracteres = "{\"nombre\":\"Salva\",\"apellido\":\"Delgado\",\"edad\":30}";
        JSONObject json_objeto = new JSONObject(cadenaDeCaracteres);
        String nombre = json_objeto.getString("nombre");
        String apellido = json_objeto.getString("apellido");
        int edad = json_objeto.getInt("edad");
        System.out.println("El nombre es: " + nombre + " el apellido es: " + apellido + " la edad es: " + edad);

        System.out.println("--------------------------------------------------------------------");

        //Crear un JSON Anidado
        JSONObject persona = new JSONObject();
        persona.put("Nombre", "Salva");
        persona.put("Apellido", "Delgado");
        persona.put("Edad", 25);
        persona.put("Correo electronico", "sdarroyo@indra.es");

        JSONObject direccion = new JSONObject();
        direccion.put("Calle", "Calle falsa 1234");
        direccion.put("Ciudad", "Madrid");
        direccion.put("Pais", "España");
        persona.put("direccion", direccion);

        String calle = persona.getJSONObject("direccion").getString("Calle");
        System.out.println("La informacion de la persona es: " + persona);

        System.out.println("--------------------------------------------------------");

        //Ejemplo de array
        JSONObject persona1 = new JSONObject();
        persona1.put("Nombre", "Salva");
        persona1.put("Apellido", "Delgado");

        JSONObject persona2 = new JSONObject();
        persona2.put("Nombre", "Gustavo");
        persona2.put("Apellido", "Vargas");

        JSONArray personas = new JSONArray();
        personas.put(persona1);
        personas.put(persona2);

        System.out.println(personas);

        /*Ordenar objeto de tipo JSON
        String jsonString = "{\"a\": 1, \"b\": 2, \"c\": 3}";
        JSONObject jsonObj = new JSONObject(jsonString);

        List<String> llaves = new ArrayList<>(objeto.keySet());
        Collections.sort(llaves);       //ordenamos los elementos

        JSONObject elementosOrdenados = new JSONObject();
        for(String llave: llaves){
            elementosOrdenados.put(llave,llaves.get(llaves));
        }
         */

        System.out.println("-------------------------------------------------------");

        String jsonString = "[3,2,1,0]";
        JSONArray jsonArray = new JSONArray(jsonString);
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            lista.add(jsonArray.getInt(i));
        }
        Collections.sort(lista);
        System.out.println("Mi array ordenado es el siguiente: " + lista);

        System.out.println("-------------------------------------------------------");

        String json_a = "{\"nombre\":\"Salva\",\"apellido\":\"Delgado\",\"edad\":25}";

        Gson gson = new GsonBuilder().create(); //Instancia a GSON y
        TreeMap<String, Object> treeMap = gson.fromJson(json_a, TreeMap.class);

        System.out.println("El objeto de JSON ordenado tiene esta apariencia: " + treeMap);

        //APIS: ¿Qué es un endpoint?
        //API más usada = API de REST. Ofrece grandes atributos que la hacen dinámica y flexible.
        //El cliente envía paquetes de información.
    }
}
