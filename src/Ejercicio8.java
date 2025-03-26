import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de preguntas que realizo");
        float peHechas= input.nextFloat();
        System.out.println("Ingrese cuantas preguntas quedo bien");
        float peCorrectas = input.nextFloat();
        float nivel =  (peCorrectas/peHechas)*100;
        System.out.println(nivel+"%");
        if (nivel>=90) {
            System.out.println("Nivel maximo");
        }
        if (nivel>=75 && nivel<90) {
            System.out.println("Nivel medio");
        }
         if (nivel>=50 && nivel<75) {
           System.out.println("Nivel regular");
        }
        else if (nivel<50) {
            System.out.println("Fuera de nivel");
        }
       input.close();
        
    }
}
