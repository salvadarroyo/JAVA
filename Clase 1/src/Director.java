public final class Director extends Empleado{
    String mensajeFinal = "Aquí termina la herencia";

    public static void main(String[] args){
        Director dir = new Director();
        System.out.println(dir.mensajeFinal);
    }
}

/*Si queremos crear una nueva clase que herede de director, esto no es posible,
porque director es una clase final y no se pud
 */
