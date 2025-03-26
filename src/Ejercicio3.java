import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numEntrada = input.nextInt();
        input.close();
        if (numEntrada<=0 || numEntrada>=100) {
            System.out.println("Numero no valido");
            return;
        }
        if (numEntrada>=1 && numEntrada<=9) {
            System.out.println("El numero solamente tiene 1 digito"); 
        }
        else if (numEntrada>=10 && numEntrada<=99) {
            System.out.println("el numero tiene 2 digitos");
        }
    }
}
