import java.util.Scanner;

public class tiendadeRopa {
    public static void main(String[] args) {
        byte camisa = 25;
        byte pantalon = 30;
        
       Scanner scanner = new Scanner(System.in);
       System.out.print ("Ingrese cuantas camisas quiere");
        int numCamisa = scanner.nextInt();
        System.out.print ("Ingrese cuantos pantalones quiere");
        int numPantalon = scanner.nextInt();
        int vaCamisa = camisa * numCamisa;
        int vaPantalon = pantalon * numPantalon;
        float promPantalon = vaPantalon-(0.15f * vaPantalon);
        float promCamisa = vaCamisa-(0.15f * vaCamisa);
        if (numCamisa >=2){
        float prom2Camisa = promCamisa-(0.05f* promCamisa);
        System.out.println("El valor final de las camisas fue " + promCamisa + " y con el descuento adicional quedo " + prom2Camisa);
        }
        else {
            System.out.println("El valor final de las camisas fue " + promCamisa);
        }
        System.out.println("El valor final de los pantalones fue " + promPantalon);
        scanner.close ();
        }
        
        
        
       
    }

    

