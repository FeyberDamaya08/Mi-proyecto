import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int numEntrada = input.nextInt();
        input.close();
        if (numEntrada<=0 || numEntrada>=1000) {
            System.err.println("Numero no valido");
            return;
        }
        if (numEntrada>0 && numEntrada<=9) {
            System.out.println("El numero ingresado tiene 1 cifra");
        }
        else if (numEntrada>=10 && numEntrada<=99) {
            System.out.println("El numero ingresado tiene 2 cifra");
        }
        else {
           System.out.println("El numero ingresado tiene 3 digitos"); 
        }

    }
}