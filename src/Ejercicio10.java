import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Ingrese su sueldo" );
     double sueldoInicial = input.nextDouble();
     System.out.println("Ingrese sus años de antiguedad");
     byte añosAntiguo = input.nextByte();
     input.close();
     if (sueldoInicial<500 && añosAntiguo>=10) {
       double aumentoSalario = sueldoInicial+(sueldoInicial*20/100);
       System.out.println("Su sueldo quedo en"+aumentoSalario);
     }
     if (sueldoInicial<500 && añosAntiguo<10) {
        double aumentoSalario = sueldoInicial+(sueldoInicial*5/100);
        System.out.println("Su sueldo quedo en"+aumentoSalario);
      }
      else if (sueldoInicial>=500) {
        System.out.println("Su sueldo se mantiene en"+sueldoInicial);
        
      }
    }
}