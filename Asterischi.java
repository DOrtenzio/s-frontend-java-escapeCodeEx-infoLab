public class Main {
    public static void Main(String [] args){

    }
    public static String posizione(int x, int y) {
        return "\033["+ y +";2"+ x +"H";
    }
    public static void ritardo() {
        for (int i = 0; i < 999999999; i++) {
            for (int j = 0; j < 999999999; j++) {
                // Non fare nulla
            }
        }
    }
    //Disegna quadrato
    //Coppia casuale di numeri che stampi nel quadrato asterischi
}
