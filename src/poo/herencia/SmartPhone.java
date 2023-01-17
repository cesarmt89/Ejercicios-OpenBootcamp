package poo.herencia;

import poo.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    public boolean llamadas;
    public boolean gps;
    public String procesador;
    public int numNucleos;
    public int memoriaRam;

    public SmartPhone(){

    }

    public SmartPhone(String marca, String modelo, String oS, boolean bluetooth, boolean wifi, int capacidadBateria, boolean llamadas, boolean gps, String procesador, int numNucleos, int memoriaRam) {
        super(marca, modelo, oS, bluetooth, wifi, capacidadBateria);
        this.llamadas = llamadas;
        this.gps = gps;
        this.procesador = procesador;
        this.numNucleos = numNucleos;
        this.memoriaRam = memoriaRam;
    }
}

