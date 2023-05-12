package estudo;

public class Ordenararray10 {
    public static void main(String[] args) {
        int[] t = {9,2,7,8,4,6,3,5,1,10};
        int i=0,j=1;
        int aux;
        for (i=0; i<=t.length-1; i++) { 
            for (j=i+1; j<=t.length-1; j++) {      
                if(t[j] < t[i]) {
                    aux=t[i];
                    t[i]=t[j];
                    t[j]=aux;
                }
            }
        }
        for (i=0; i<=9; i++) {
            System.out.println(t[i]);
        }
    }
}
