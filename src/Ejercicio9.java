import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la 1 nota");
        float nota1 = input.nextFloat();
        System.out.println("ingrese la 2 nota");
        Float nota2 = input.nextFloat();
        System.out.println("ingrese la 3 nota");
        float nota3 = input.nextFloat();
        input.close();
        float prom = (nota1+nota2+nota3)/3;
        if (prom >=7) {
            System.out.println("promocionado");
        }
        else if (prom>=4 && prom<7) {
            System.out.println("Regular");
        }
        else if  (prom<4) {
            System.out.println("Reprobado");
        }
    }
}
