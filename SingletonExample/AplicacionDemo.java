package Creacionales.SingletonExample;

public class AplicacionDemo {
    private static AplicacionDemo aplicacionDemo;
    boolean powerOn = false;

    private AplicacionDemo(){}

    public static AplicacionDemo getInstance(){
        if(aplicacionDemo == null){
            aplicacionDemo = new AplicacionDemo();
        }
        return aplicacionDemo;
    }

    public void powerON(){
       if(!powerOn){
           powerOn = true;
           System.out.println("El equipo se ha encendido");
       } else {
           System.out.println("El equipo ya se encuentra en ejecucion.");
       }

    }
}
