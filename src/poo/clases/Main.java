package poo.clases;

import poo.herencia.SmartPhone;
import poo.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone samsungA51 = new SmartPhone("Samsung", "A51", "Android 10", true, true,
                4000, true, true, "Exynos 9611", 8, 8);

        System.out.println(samsungA51.marca);
        System.out.println(samsungA51.modelo);
        System.out.println(samsungA51.oS);
        System.out.println(samsungA51.bluetooth);
        System.out.println(samsungA51.wifi);
        System.out.println(samsungA51.capacidadBateria);
        System.out.println(samsungA51.llamadas);
        System.out.println(samsungA51.gps);
        System.out.println(samsungA51.procesador);
        System.out.println(samsungA51.numNucleos);
        System.out.println(samsungA51.memoriaRam);

        System.out.println();
        System.out.println();



       SmartWatch xiaomiMiSB6 = new SmartWatch("Xiaomi", "Mi Smart Band 6", "Android 10",
               true, false, 125, true, true, 30);

        System.out.println(xiaomiMiSB6.marca);
        System.out.println(xiaomiMiSB6.modelo);
        System.out.println(xiaomiMiSB6.oS);
        System.out.println(xiaomiMiSB6.bluetooth);
        System.out.println(xiaomiMiSB6.wifi);
        System.out.println(xiaomiMiSB6.capacidadBateria);
        System.out.println(xiaomiMiSB6.controlRitmoCardiaco);
        System.out.println(xiaomiMiSB6.controlSPO2);
        System.out.println(xiaomiMiSB6.modosDeportivos);
    }
}