import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la 1 nota:");
        float nota1 = input.nextFloat();
        System.out.println("Ingrese la 2 nota:");
        float nota2 = input.nextFloat();
        System.out.println("Ingrese la 3 nota:");
        float nota3 = input.nextFloat();
        float prom = (nota1+nota2+nota3)/3;
        input.close();
        if (prom>=7) {
            System.out.println("Promocionado");
        }

    }
}
