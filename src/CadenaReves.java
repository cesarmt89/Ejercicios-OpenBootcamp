import java.util.Scanner;

public class CadenaReves {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String texto = scanner.nextLine();

        StringBuilder reves = new StringBuilder(texto);
        texto = reves.reverse().toString();
        System.out.println(texto);

    }
}



