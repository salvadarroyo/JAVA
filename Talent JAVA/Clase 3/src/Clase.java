import java.util.*;

//Listas:
//Es una estructura de datos que puede contener una serie de elementos
//en una secuencia ordenada

//La lista se representa por consola con []
// -

public class Clase{
    public static void main(String[] args){
        /*
        List<String> nombres = new ArrayList<String>();
        //agregar elementos a una lista
        nombres.add("Gustavo");
        nombres.add("Salva");
        nombres.add("Maria");
        nombres.add("Pablo");
        nombres.add("Salva");      //admite duplicados
        System.out.println(nombres);

        //OBtener el tamaño de la lista
        int tamanio = nombres.size();
        System.out.println("El tamaño de la lista es: " + tamanio);

        //Obtener el elemento en la posicion 2
        String nombre_pos_2 = nombres.get(2);
        System.out.println("El nombre de la posicion 2 es: " + nombre_pos_2);

        //Borrar un elemento de la lista. Elimino a Salva en la pos 4
        nombres.remove(4);
        System.out.println("Los nombres actualizados son: " + nombres);

        //Actualizar elementos en un alista
        nombres.set(0, "Alberto");
        System.out.println("Los nombres actualizados son: " + nombres);

        //Comprobar si la lista contiene un elemento
        boolean contiene = nombres.contains("Emilio");
        System.out.println("La Lista de nombres contiene a Emilio? ");

        //Eliminar todos los elementos de la lista
        nombres.clear();
        System.out.println("Elimine todos los elementos de la lista: " + nombres);

        //Listas con varios tipos de datos
        List<Integer> listaDeEnteros = new ArrayList<>();
        listaDeEnteros.add(1);
        listaDeEnteros.add(2);
        listaDeEnteros.add(3);

        List<String> colores = new ArrayList<>();
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");

        List<Object> objetoLista = new ArrayList<>();
        objetoLista.add(listaDeEnteros);
        objetoLista.add(colores);

        System.out.println("Mi lista nueva es: " + objetoLista);

        //Set: es una interfaz que extiende de la colección de Colection
        //que representa valores únicos.
        //  - No esta ordenado
        //  - No admite duplicados

        Set<String> lenguajesDeProgramacion = new HashSet<String>();
        lenguajesDeProgramacion.add("Python");
        lenguajesDeProgramacion.add("Python");
        lenguajesDeProgramacion.add("Python");
        lenguajesDeProgramacion.add("Python");
        lenguajesDeProgramacion.add("Java");
        lenguajesDeProgramacion.add("SQL");
        lenguajesDeProgramacion.add("C#");
        lenguajesDeProgramacion.add("C++");
        lenguajesDeProgramacion.add("Cobol");
        lenguajesDeProgramacion.add("GO");
        lenguajesDeProgramacion.add("Javascript");
        lenguajesDeProgramacion.add("Ruby");
        lenguajesDeProgramacion.add("Matlab");
        System.out.println("La lista de lenguajes de programacion es: " + lenguajesDeProgramacion);

        //Elimino un elemento
        lenguajesDeProgramacion.remove("GO");
        System.out.println("La lista de lenguajes de programacion actualizada es: " + lenguajesDeProgramacion);

        //Obtener el tamaño
        int tamanio_set = lenguajesDeProgramacion.size();
        System.out.println("El tamaño es de: " + tamanio_set);

        //Limipo el conjunto
        //lenguajesDeProgramacion.clear();

        //Set con varios tipos de datos
        Set<Integer> numeros = new HashSet<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Set<Object> objeto = new HashSet<Object>(); //tambien se puede dejar como new HashSet<>()
        objeto.add(lenguajesDeProgramacion);
        objeto.add(numeros);
        System.out.println("Los elementos del objeto son: " + objeto);
        */

        //Cuando usar SET:
        //  - Necesitas almacenar elementos unicos
        //  - No te interesa el orden que tengan
        //  - No te importa el rendimiento del programa respecto
        //  al acceso de los elementos de Set.

        //Cuando usar Lista
        //  - Necesitas almacenar elementos duplicados
        //  - Necesitas almacenar elementos en un orde especifico
        //  - Que se puedan acceder a traves del indice

        /*
        Map: En Java es una estructura de datos que se utiliza para almacenar
        una colección de pares clave.valor. Cada elemento contiene dos partes:
        una clave que se utiliza para idear el valor asociado. Y el valor de
        dicha clave.
        Tipos de maps:
            - TreeMap
            - HashMap
            - LinkedHashMap

        HashMap: Es una implementación de Map que utiliza una tabla HASH.
        Para almacenar sus elementos. Es una de las implementaciones
        y eficientes, per no garantiza el orden de los elementos.
        No admite duplicados
        */

        HashMap<String, Integer> usuarios = new HashMap<>();
        usuarios.put("Gustavo", 30);
        usuarios.put("Maria", 26);
        usuarios.put("Pablo", 24);
        usuarios.put("Salva", 25);
        usuarios.put("Hernan", 29);
        usuarios.put("Gustavo", 30);    //no admite duplicados

        //Imprimo el par clave-valor
        System.out.println(usuarios);

        //Accedemos a un elemento específico:
        int edadSalva = usuarios.get("Salva");
        System.out.println(edadSalva);

        //Modificar un elemento en clave-valor
        usuarios.put("Salva", 45);
        System.out.println("Cambiamos la edad del usuario Salva: " + usuarios);

        //Eliminar un elemento del HashMap
        usuarios.remove("Pablo");
        System.out.println("Eliminamos al usuario Pablo: " + usuarios);

        //Recorrer los elementos del HashMap
        for(String nombre: usuarios.keySet()){
            int edad = usuarios.get(nombre);
            System.out.println("El nombre es " + nombre + " y la edad es " + edad);
        }
    }
}
