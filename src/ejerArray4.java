import java.util.Scanner;

public class ejerArray4 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int [] numeros = new int[10];
     for(int i=0;i<numeros.length;i++){
        System.out.println("Introduzca los numeros");
        numeros[i] = input.nextInt();
        if (numeros[i]<0) {
            for (int e=0;e<numeros.length;e++){
            System.out.println("Los numeros introducidos fueron "+numeros[e]);
            }
            return;
        }

     }
     for (int j=0;j<numeros.length;j++){
     System.out.println("Numeros ingresados: "+numeros[j]);
     }
     input.close();
    }
}
