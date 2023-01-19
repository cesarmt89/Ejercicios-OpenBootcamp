import java.util.Scanner;

public class DivideZero {

    private static int DividirZero(int numA, int numB){
        return numA / numB;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los dos numeros a dividir: ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        try {
            System.out.println("El resultado es: " + DividirZero(numA, numB));
        } catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0.");
        }finally {
            System.out.println("Demo de codigo.");
        }
    }
}
