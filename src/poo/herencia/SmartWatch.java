package poo.herencia;

import poo.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    public boolean controlRitmoCardiaco;
    public boolean controlSPO2;
    public int modosDeportivos;

    public SmartWatch(){

    }

    public SmartWatch(String marca, String modelo, String oS, boolean bluetooth, boolean wifi, int capacidadBateria, boolean controlRitmoCardiaco, boolean controlSPO2, int modosDeportivos) {
        super(marca, modelo, oS, bluetooth, wifi, capacidadBateria);
        this.controlRitmoCardiaco = controlRitmoCardiaco;
        this.controlSPO2 = controlSPO2;
        this.modosDeportivos = modosDeportivos;
    }
}

