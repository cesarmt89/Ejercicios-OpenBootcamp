package Ejercicio;

import java.util.Scanner;

public class PrecioIva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        double precioSinIva = scanner.nextDouble();

        double precioConIva = precioSinIva * 1.21;

        System.out.println("El precio del producto con el IVA incluido es: " + precioConIva);
    }
}
