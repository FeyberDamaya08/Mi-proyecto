import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        Byte num1 = input.nextByte();
        Byte num2 = input.nextByte();
        input.close();
        if (num1>num2) {
            System.out.println("El "+num1+"es mayor que"+num2);
    
        }
        else {
            System.out.println("el "+num2+"es mayor que"+num1);
        }
    }
}
