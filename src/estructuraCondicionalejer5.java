import java.util.Scanner;
public class estructuraCondicionalejer5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca un numero");
    Byte num = scanner.nextByte();

    for (int i=1;i<=10;i++) {
        int multiplicacion = num*i;
        System.out.println(num+"*"+i+"="+multiplicacion);

    }
    scanner.close();


    }
}
