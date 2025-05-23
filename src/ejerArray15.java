import java.util.Scanner;

public class ejerArray15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][] equipos = new String[15][2];
        int [][] marcador = new int[15][2];
        for (int i=0;i<15;i++){
                System.out.println("Ingrese los nombres de los equipos del partido");
                 equipos [i] [0] = input.next();
                 equipos [i] [1] = input.next();
                 System.out.println("Ingrese el marcador del partido");
                 marcador[i][0] = input.nextInt();
                 marcador[i][1] = input.nextInt();       
      } 
      for(int y=0;y<15;y++){


        

      System.out.println("en el partido de "+equipos[y][0]+ " y "+equipos[y][1]+" el marcador quedo: "+marcador[y][0]+"/"+marcador[y][1]);






      }








    }

}
