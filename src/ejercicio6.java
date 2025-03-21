import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        input.close();
        if (num>0) {
            System.out.println("El numero es positivo");
        }
        else if (num<0) {
            System.out.println("el numero es negativo");
        }
        else {
            System.out.println("El numero es nulo");
        }
    }
}
