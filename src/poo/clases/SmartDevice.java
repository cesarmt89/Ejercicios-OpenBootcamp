package poo.clases;

public class SmartDevice {

    protected String marca;
    protected String modelo;
    protected String oS;
    protected boolean bluetooth;
    protected boolean wifi;
    protected int capacidadBateria;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, String oS, boolean bluetooth, boolean wifi, int capacidadBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.oS = oS;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.capacidadBateria = capacidadBateria;
    }
}
