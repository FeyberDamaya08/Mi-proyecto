import java.util.Scanner;

public class ejerArra7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] vector1 = new int[5];
        int [] vector2 = new int[5];
        int [] vector3 = new int[5];
        for (int i=0;i<5;i++){
            System.err.println("Ingrese los numeros para el vector 1");
            vector1 [i]=input.nextInt();
            System.err.println("Ingrese los numeros para el vector 2");
            vector2 [i]=input.nextInt();
            vector3 [i] = vector1[i]+vector2[i];
        }
        for (int o=0;o<5;o++)
        System.out.println("El total de la suma de los dos vectore es: "+vector3[o]);
        input.close();
    }
}
