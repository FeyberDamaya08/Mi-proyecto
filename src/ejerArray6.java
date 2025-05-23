import java.util.Scanner;

public class ejerArra6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] noMeses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        int [] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("1.enero");
        System.out.println("2.febrero");
        System.out.println("3.marzo");
        System.out.println("4.abril");
        System.out.println("5.mayo");
        System.out.println("6.junio");
        System.out.println("7.julio");
        System.out.println("8.agosto");
        System.out.println("9.septiembre");
        System.out.println("10.octubre");
        System.out.println("11.noviembre");
        System.out.println("12.diciembre");
        System.err.println("Ingrese numero del mes que desea saber cuanto dias tiene: ");
        int elegido= input.nextInt();
        elegido= elegido-1;
        System.out.println("El mes que elegiste fue "+noMeses[elegido]+" y tiene "+dias[elegido]+ " dias.");

       




        
    }
}
