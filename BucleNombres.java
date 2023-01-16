import java.util.Scanner;

public class BucleNombres {
    public static void main(String[] args) {

        String[] nombres= {"Guchunini", "Aramcito", "Raquel", "Cesar"};

        for(int i = 0; i < nombres.length; i++ ){
            System.out.print(nombres[i]+ " " );
        }

        System.out.println();

        String[] nombres2= {"Guchunini", "Aramcito", "Raquel", "Cesar"};
        for(String nombre2 : nombres2 ){
            System.out.print(nombre2 + " " );
        }

    }
}
