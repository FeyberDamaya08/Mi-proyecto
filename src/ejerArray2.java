import java.util.Scanner;

public class ejerArra2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] palabras = new String [5];
        int i;
        for (i=0;i<palabras.length;i++) {
        System.out.println("Escribe palabras ramdom palabras al azar");
        palabras [i] = input.next();
        }
        for (int j=0;j<palabras.length;j++){
        System.out.println("array original: "+palabras[j]);
    }
    for(int o=4;o>=0;o--){
        System.out.println("array invertida: "+palabras[o]);

    }

    }
}   

