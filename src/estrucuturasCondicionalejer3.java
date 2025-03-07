import java.util.Scanner;

public class estrucuturasCondicionalejer3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1 suma");
    System.out.println("2 resta");
    System.out.println("3 multiplar");
    System.out.println("4 dividir");
    System.out.println("Elija una opcion");
    Byte opcion = scanner.nextByte();
    System.out.println("Ingrese 2 numeros");
    Byte num1 = scanner.nextByte();
    Byte num2 = scanner.nextByte();
    switch (opcion) {
        case 1: int suma = num1+num2;
            System.out.println("La suma dio"+ suma);
            break;
        case 2: int resta = num1-num2;
            System.out.println("La resta dio"+ resta);  
            break;
        case 3: int multiplicacion= num1*num2;
            System.out.println("La multiplicion dio"+ multiplicacion);
            break;
        case 4: int division = num1/num2;
            System.out.println("La division dio"+ division);
            break;

        default:
            System.out.println("Numero no valido");
            break;
    }
        scanner.close();
    }
    
}
