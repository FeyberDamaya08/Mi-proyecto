import java.util.Scanner;

public class ejerArray10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] [] matriz = {
        {1,2,3,6,7},
        {2,4,7,5,2},
        {6,4,7,2,1},
        {8,2,1,3,1},
        {1,7,8,7,1}
        };
        int sumaFilas=0;
        int sumaColum=0;
        for (int i=0;i<5;i++){

         for (int a=0;a<5;a++) {
            sumaFilas += matriz [i][a];
            sumaColum += matriz [a][i];
         }   


        }
        System.out.println("Elt total de la suma de las filas fue; "+sumaFilas+" y de las columas fue: "+sumaColum);
    }
}