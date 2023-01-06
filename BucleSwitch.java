public class Main {
    public static void main(String[] args) {
            var estacion = "PRIMAVERA";

        switch (estacion){
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("La variable no es una estacion");

        }
    }
}