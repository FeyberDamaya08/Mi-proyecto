import java.util.Scanner;

public class estructurasControlejer1 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Ingrese tres numeros");
     Byte num1 = scanner.nextByte();
     Byte num2 = scanner.nextByte();
     Byte num3 = scanner.nextByte();

     if ((num1>num2 && num1>num3) ){

    
     System.out.println("El numero mayor es"+ num1);
    }

     else if ((num2>num1 && num2>num3)) {

    System.out.println("El numero mayor es" +num2);

     }
     else  {
        System.out.println("El numero mayor es" + num3);

     }
     scanner.close();

    }
}


