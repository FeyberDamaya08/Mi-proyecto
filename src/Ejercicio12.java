import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int o=0;
        int b =0;
        double gasTotal=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados que hay en la empresa");
        int canEmpleados = input.nextInt();
        for(int i=1;i <=canEmpleados;i++){
            System.out.println("cuanto salario gana");
            double salario= input.nextDouble();
            if (salario<100 && salario>500 ) {
                System.out.println("salario no disponible");
                return;
            }
            if (salario>=100 && salario<=300) {
                o++;
            }
            else if (salario>300) {
                b++;
            }
            gasTotal += salario;
        }
        System.out.println(o+"Ganan entre 100$ y 300$");
        System.out.println(b+"Ganan mas de 300$");
        System.out.println("El gasto total de la empresa en salarios es"+gasTotal);
        input.close();
    }
}
