public class Asterischi {
    public static void main(String[] args){
        quadrato(7);
    }
    public static void quadrato(int dim) {
        for(int i=0;i<dim;i++){ //RIghe
            for(int p=0;p<dim;p++){ //Colonne
                if (i==0 || i==dim-1) {
                    System.out.print("*");
                }else if(p==0 || p==dim-1){
                    System.out.print("*");
                }else{
                    System.out.print();
                }
            }
            System.out.println();
        }
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
