import java.util.Scanner;

public class operadoresLogicosPrac {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);

       System.out.print("Ingresa tres numeros");
        Byte num1 = scanner.nextByte();
        Byte num2 = scanner.nextByte();
        Byte num3 = scanner.nextByte();
    
        boolean resultado = (num1>num2)&&(num1<num3);

        System.out.printf( "Se cumplio? " + resultado );

        scanner.close();







    }
}