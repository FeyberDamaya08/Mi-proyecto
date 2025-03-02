import java.util.Scanner;

public class EntradaSalidaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad:");
        Byte edad = scanner.nextByte();
        System.out.print("ingrese su estatura:");
        Double estatura = scanner.nextDouble();
        System.out.printf("Su nombre es " +nombre+ " y su edad es " +edad+ "por ultimo su estatura es " +estatura);

        scanner.close();



    }

}