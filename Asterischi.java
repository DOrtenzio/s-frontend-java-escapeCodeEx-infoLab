import java.util.Scanner;

public class Asterischi {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int dim;
        //Creazione Del quadrato
        System.out.println("Inserire la dimensione del quadrato");
        do{ 
            dim=in.nextInt();
        }while(dim<0);
        quadrato(dim);
    }
    //Funzione per il quadrato
    public static void quadrato(int dim) {
        for(int i=0;i<dim;i++){ //RIghe
            for(int p=0;p<dim;p++){ //Colonne
                if (i==0 || i==dim-1) {
                    System.out.print("*\t");
                }else if(p==0 || p==dim-1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("\n\n");
        }
    }
    // FUnzione per il posizionamento
    public static String posizione(int x, int y) {
        return "\033["+ y +";2"+ x +"H";
    }
    //Funzione per il ritardo
    public static void ritardo() {
        for (int i = 0; i < 999999999; i++) {
            for (int j = 0; j < 999999999; j++) {
                // Non fare nulla
            }
        }
    }
    //Funzione per numeri casuali dove stampare
    public static int xPosizione (int dim) {
        int x;
        do{

        }while(x<=0 || x>=dim-1);
        return x;
    }
    public static int yPosizione (int dim) {
       int y;
       do{

       }while(y<=0 || y>=dim-1);
       return y; 
    }
}
