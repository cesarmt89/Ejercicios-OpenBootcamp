import java.util.Vector;

public class VectorEjercicio {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Hola ");
        vector.add("a ");
        vector.add("todo ");
        vector.add("el ");
        vector.add("mundo");

        System.out.println("Datos del vector:" + vector);
        vector.remove(2);
        vector.remove(1);

        System.out.println("Datos del vector:" + vector);
        System.out.println("El problema de no declarar una capacidad inicial con los " +
                "vectores, es que cuando se sobrepasa el limite por defecto (10)" +
                "la dimension del vector se duplica, por lo que genera mucho " +
                "desperdicio de memoria.");
    }
}
