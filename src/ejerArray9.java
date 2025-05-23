import java.util.Scanner;

public class ejerArray9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] maxTemp = new int[5];
        int [] minTemp = new int[5];
        int [] temMedia = new int [5];
        int [] temCompa = new int [5];
        for (int i=0;i<5;i++) {
            System.out.println("Ingrese la tempratura maxima del dia "+(i+1));
            maxTemp [i] = input.nextInt();
            System.out.println("Ingrese la temperatura minima del dia "+(i+1));
            minTemp [i] = input.nextInt();
            temMedia [i] = (maxTemp[i] + minTemp[i])/2;

        }
        System.out.println("Ingresa una temperatura");
        int temIngre = input.nextInt();
        for (int u=0;u<5;u++){
            if (maxTemp[u]==temIngre) {
                temCompa[u] = u;
            }
           else if (maxTemp[u]!=temIngre){
            System.out.println("la temperatura ingresada no es igual a las de los dia ingresados");  
              

           }
                
            
        }
        for (int a=0;a<5;a++){
         System.out.println("La temperatura media del dia " +(a+1)+ "fue " +temMedia[a]);   
         System.out.println("Los dias con la misma temperatura fue "+temCompa[a]);

        }       
    }
}
