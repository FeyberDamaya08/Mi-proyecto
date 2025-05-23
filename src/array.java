import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
     int [] [] matriz = new int [4] [4];
    for (int i=0;i<4;i++) {
      for (int j=0;j<4;j++) {
        System.out.print("estamos en la posicion"+i+j);
        System.out.print("Ingrese los numeros de la matriz");
        matriz [i][j] = input.nextInt();
        
        
      }
        
    }
for (int i=0;i<4;i++){
 for (int j=0;j<4;j++){
 System.out.print(matriz [i][j]);

}
System.out.println();

    }
    input.close();
}
} 