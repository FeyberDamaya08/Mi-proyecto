import java.util.Scanner;

public class numero {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        System.out.println("El numero es" + num);
        if (num<=0) {
            System.out.print("El numero no valido");
        }
         for (int k=1; k<=num;k++){
            for (int j=1;j<=k;j++) {
                if (j%2==1) {
                   System.out.print(k); 
                    
                }
                else {
                    System.out.print(k*-1);
                    if (j<k){
                        System.out.print("");
                    }

                }
                System.out.println();
            }
         }
            
        }
      
        
       


    }
