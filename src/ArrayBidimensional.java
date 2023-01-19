public class ArrayBidimensional {
    public static void main(String[] args) {

        int[][] numerosBidi = new int[2][3];
        numerosBidi[0][0] = 1987;
        numerosBidi[0][1] = 1989;
        numerosBidi[0][2] = 1992;

        numerosBidi[1][0] = 1995;
        numerosBidi[1][1] = 2012;
        numerosBidi[1][2] = 2023;

        for (int i = 0; i < numerosBidi.length; i++){
            for(int j = 0; j < numerosBidi[1].length; j++){
                System.out.println("Estoy en la posicion i: " + i + " j: " + j);
                System.out.println("El valor es: " + numerosBidi[i][j]);
            }
        }

    }
}
