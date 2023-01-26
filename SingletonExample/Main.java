package Creacionales.SingletonExample;

public class Main {
    public static void main(String[] args) {

        AplicacionDemo aplicacionDemo = AplicacionDemo.getInstance();
        AplicacionDemo aplicacionDemo1 = AplicacionDemo.getInstance();

        System.out.println(aplicacionDemo.powerOn);
        System.out.println(aplicacionDemo1.powerOn);

        aplicacionDemo.powerON();
        aplicacionDemo1.powerON();

        System.out.println(aplicacionDemo + " " + aplicacionDemo1);
    }
}
