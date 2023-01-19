import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ImputYPrintStream {

    private static void Copiar(String fileIn, String fileOut){
        try{
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
            System.out.println("La copia se realizo con exito.");

        } catch (Exception e){
            System.out.println("No se pudo realizar la copia. Excepcion: " + e.getMessage());
        }finally {
            System.out.println("Proceso terminado.");
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la direccion del fichero de origen: ");
        String fileIn = scanner.nextLine();

        System.out.println("Introduce la direccion donde se va realizar la copia: ");
        String fileOut = scanner.nextLine();
        Copiar(fileIn, fileOut);
    }
}
