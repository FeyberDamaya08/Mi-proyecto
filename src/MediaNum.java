import java.util.Scanner;

public class mediaNum {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese tres numero");
        Byte num1 = scanner.nextByte();
        Byte num2 = scanner.nextByte();
        Byte num3 = scanner.nextByte();

        float media = (num1+num2+num3)/3;
        System.out.printf("La media de los 3 numeros que ingresate es "+ media);
        scanner.close();
 }
}
