import java.util.Scanner;

public class ejerArray13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos conductores tiene?");
        int conductores = input.nextInt();
        String [] nombres = new String [conductores];
        int [] totalKms = new int[conductores];


         for (int h=0;h<conductores;h++ ){
         System.out.println("Ingrese el nombre del conductor");
            nombres [h] = input.next();
            int acumulador =0;
            int [] kms = new int[7];
        for (int i=0;i<7;i++){
           
            System.out.println("Ingrese cuantos kms recorrio hoy? dia "+(i+1));
            kms [i] = input.nextInt();

           acumulador += kms[i];
        

        }
         totalKms [h]=acumulador;
        }
        for (int j=0;j<conductores;j++) {

            System.out.println("el conductor "+nombres[j]+" recorrio "+totalKms[j]+ " kms en total" );


        }
    }
}
