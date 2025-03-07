import java.util.Scanner;
public class estructuraCondicionalejer4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite un numero");
    int num = scanner.nextInt();
    int factorial =1;
    int i =1;
    while (num>=i){
    factorial*=i;
    i++;
    }
    System.out.println("El factorial del numero"+num+ "es" +factorial);
    scanner.close();
    }
}
