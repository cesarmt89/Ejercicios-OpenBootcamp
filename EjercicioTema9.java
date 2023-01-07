public class EjercicioTema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = (33);
        cliente.nombre=("Cesar Mattar");
        cliente.telefono = (154329606);
        cliente.credito = ("No posee credito");

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);


    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona {
    String credito;
}

class Trabajador extends Persona{
    int salario;
}