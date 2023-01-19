import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListYLinkedList {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Santiago");
        lista.add("Buenos Aires");
        lista.add("Cordoba");
        lista.add("Santa Fe");

        LinkedList<String> listaEnlazada = new LinkedList<>(lista);
        System.out.println("Elementos del ArrayList: " + lista);
        System.out.println("Elementos del LinkedList: " + listaEnlazada);

        //2da opcion: (Es necesario borrar el parametro (lista) en la creacion de la nueva
        //LinkedList para que no se repitan los datos a traves del bucle for).

        for (int i = 0; i < lista.size(); i++){
            listaEnlazada.add(i, lista.get(i));
        }
        System.out.println("Elementos del ArrayList:");
        for(String elementos : lista){
            System.out.print(elementos + " ");
        }
        System.out.println("\n\n Elementos de la LinkedList:");
        for(String elementos : listaEnlazada){
            System.out.print(elementos + " ");
        }
    }
}
