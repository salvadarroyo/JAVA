/*
EJERCICIO 1:
Nos pidieron desarrollar una calculadora con las siguientes funcionalidades:
- Suma
- Resta
- Divison
- Multiplicación
Donde el usuario pueda ingresar valores por consola el mismo.
La unica consideración que nos pidieron tener presente es que en el caso de la division, no se puede dividir por 0. Nuestro
programa debe poder manejar esta situación mediante el uso del IF
ENTREGABLES:
- Codigo del proyecto.
*/

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;

public class Clase{
    /*
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //con system.in le indico al Scanner que
                                             //son valores por consola

        System.out.println("Ingrese la operacion que desea realizar: \n"
        + "1. Suma \n"
        + "2. Resta \n"
        + "3. Multiplicacion \n"
        + "4. Division");
        int menu = sc.nextInt();

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numero2 = sc.nextInt();

        if(menu == 1){
            int suma = numero+numero2;
            System.out.println("El resultado es: " + suma);
        }
        else if(menu == 2){
            int resta = numero-numero2;
            System.out.println("El resultado es: " + resta);
        }
        else if(menu == 3){
            int multiplicacion = numero*numero2;
            System.out.println("El resultado es: " + multiplicacion);
        }
        else if(menu == 4){
            if(numero2 != 0){
                int division = numero/numero2;
                System.out.println("El resultado es: " + division);
            }
            else{
                System.out.println("No es posible dividir entre 0. Por favor, ingresa un numero correcto para que se realice la division");
            }
        }
        else{
            System.out.println("El número introducido en el menu no es correcto.");
        }

        System.out.println("Los numeros son " + numero + " y " + numero2);
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.next();
        System.out.println("El nombre es " + nombre);

        sc.close();
    }
    */

/*Array: es una estructura de datos que almacena una colección de elementos del mismo
tipo. Son objetos que contienen un numero fijo de elementos, y cada elemento se accede
mediante un indice numerico.

    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numeros[0]);
        String[] nombre = new String[10];
        nombre[0] = "Salva";
        nombre[1] = "Gustavo";
        nombre[2] = "Juan";
        nombre[3] = "Maria";
        System.out.println("El nombre de la posicion inicial es:" + nombre[0]);
        System.out.print("Los numeros del array son: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(" " + numeros[i]);
        }
    }
 */

    /*Fechas en Java: Como declarar fechas, manejo de fechas...
    public static void main(String[] args){
        LocalDateTime fecha_hora_actual = LocalDateTime.now();
        LocalDate fecha_actual = LocalDate.now();   //Muestra la fecha en el formato
        System.out.println(fecha_actual);
        LocalDate fecha_nacimiento = LocalDate.of(1998, 2, 9);
        int edad = fecha_actual.getYear() - fecha_nacimiento.getYear();
        int edad_dias = fecha_actual.getDayOfYear();
        System.out.print("La edad de Salva es: " + edad + "\n");

        LocalDate fecha_hoy = LocalDate.now();
        LocalDate fecha_ayer = fecha_hoy.minusDays(1);
        LocalDate fecha_mañana = fecha_hoy.plusDays(1);

        System.out.println("La fecha de hoy es: " + fecha_hoy);
        System.out.println("La fecha de ayer es: " + fecha_ayer);
        System.out.println("La fecha de mañana es: " + fecha_mañana);

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY");
                                                //fechas validas: yyyy-MM-dd, dd/MM/YYYY, dd-MM/YYYY
        String fechaFormateada = fecha_hoy.format(formatoFecha);

        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraFormateada = fecha_hora_actual.format(formatoFechaHora);

        System.out.println("La fecha hora formateada es: " + fechaHoraFormateada);
        System.out.println("La fecha formateada es: " + fechaFormateada);
    }
    */

// Ficheros: creacion de ficheros
    /*public static void main(String[] args){
        try {
            String ruta = "C:\\Users\\sdarroyo\\Documents\\";
            //String ruta2 = "C:\\Users\\sdarroyo\\Documents\\salida.txt";
            String nombreArchivo = "salida.txt";
            String ruta_nombreArchivo = ruta + nombreArchivo;
            String contenido_ejemplo = "Hola que tal!";
            File archivo = new File(ruta_nombreArchivo);
            if (!archivo.exists()) {

                archivo.createNewFile();
                System.out.println("Se creo el fichero");
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(contenido_ejemplo);
                bw.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
     */

    //Leer un archivo
    public static void main(String[] args) {
        /*
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\sdarroyo\\Documents\\salida.txt"));
            while (sc.hasNextLine()) {    //tiene lineas que leer
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
        try {
            File documento = new File("C:\\Users\\sdarroyo\\Documents\\salida.txt");
            BufferedReader br = new BufferedReader(new FileReader(documento));
            String caracteres = "";
            while((caracteres = br.readLine()) != null){
                System.out.println(caracteres);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}


