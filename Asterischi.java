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
        //Posizionamento degli asterischi
        int i=0;
        while (i<10) {
            System.out.println(posizione(xPosizione(dim), yPosizione(dim))+"\u001B[3"+((int)(Math.random()*8))+"m*");
            ritardo();
            i++;
        }
    }
    //Funzione per il quadrato
    public static void quadrato(int dim) {
        for(int i=0;i<dim;i++){ //RIghe
            System.out.print("\t\t");
            for(int p=0;p<dim;p++){ //Colonne
                if (i==0 || i==dim-1) {
                    System.out.print("* ");
                }else if(p==0){
                    System.out.print("*");
                }else if(p==dim-1){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }
    }
    // FUnzione per il posizionamento
    public static String posizione(int x, int y) {
        return "\033["+ y +";2"+ x +"H";
    }
    //Funzione per il ritardo
    public static void ritardo() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Errore: " + e);
        }
    }
    //Funzione per numeri casuali dove stampare
    public static int xPosizione (int dim) {
        int x;
        do{
           x=((int)(Math.random()*dim)); 
        }while(x<=0);
        return x;
    }
    public static int yPosizione (int dim) {
       int y,dom=dim*2;
       do{
            y=((int)(Math.random()*dom));
       }while(y<=4); //Impostazione specifica per esecuzione su VS ignorando così le righe "inquinanti"
       return y; 
    }
}
