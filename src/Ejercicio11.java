import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1;
        byte o=0;
        byte j=0;
        String nombre;
        while (i<=10) {
            System.out.println("Ingrese la nota"+i);
            byte notas = input.nextByte();
            if (notas>=7) {
                o++;
            }
            else if (notas<7) {
                j++;
            }
            i++;
        }
        input.close();
        System.out.println(+o+"estudiantes obtuviron una nota mayor igual a 7");
        System.out.println(+j+"esudiantes obtuviero una nota menor que 7");

        
            
        
    }
}
