import java.util.ArrayList;

public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> listaInt = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            listaInt.add(i);

            for (int num = 0; num < listaInt.size(); num ++){
                if (listaInt.get(num) % 2 == 0){
                    listaInt.remove(num);
                }
            }
        }
        System.out.println(listaInt);

    }
}
