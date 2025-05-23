import java.util.Scanner;

public class ejerArra1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] vectCuadrado = new int [10];
        int [] vectCubo = new int [10];
        int [] vector_numeros = new int [10];
        for (int i=0;i<vector_numeros.length;i++){
            System.out.println("Ingrese numeros del 1 al 10");
            vector_numeros [i] = input.nextInt();
            if (vector_numeros[i]<=0 || vector_numeros[i]>10) {
                System.out.println("Opciones no validas");
                return;
            }
          vectCuadrado [i] = vector_numeros[i]*vector_numeros[i];
            vectCubo [i] = vector_numeros[i]*vector_numeros[i]*vector_numeros[i];
        }
        for (int j=0;j<vector_numeros.length;j++){
            System.out.println("Numeros normales : "+vector_numeros[j]+" numeros al cuadrado : "+vectCuadrado[j]+" numeros al cubo: "+vectCubo[j]);

        }
        input.close();
    }
}
