import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1= input.nextInt();
        int num2= input.nextInt();
        input.close();
        if (num1>num2) {
            System.out.println("la suma es"+(int)(num1+num2));
            System.out.println("la diferencia es"+(int)(num1-num2));
        }
        else{
            System.out.println("la multiplicacion es"+(int)(num1*num2));
            System.out.println("la division es"+(int)(num1/num2));

        }
    }
}
