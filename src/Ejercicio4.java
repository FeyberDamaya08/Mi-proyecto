import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        double sueldoIngresado = input.nextDouble();
        input.close();
        if (sueldoIngresado>=3000) {
          System.out.println("Debe abonar impuestos");  
        }
    }
}
