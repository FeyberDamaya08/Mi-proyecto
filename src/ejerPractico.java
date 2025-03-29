import java.util.Scanner;

public class ejerPractico {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] numeros = new int [5];
    int suma = 0;
    for (int i=0;i<numeros.length;i++){
        System.out.println("Ingrese un numero");
        numeros [i] = input.nextInt();
        suma += numeros[i];
    }
    double resultado = suma/numeros.length;
    System.out.println("el promedio es"+resultado);

    }
}