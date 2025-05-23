import java.util.Scanner;

public class ejerArra3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] notas = new double[5];
        double media = 0;
        double menor=0;
        double mayor=0;
        for (int i=0;i<notas.length;i++){
            System.out.println("Ingrese la notas del estudiante");  
            notas [i] = input.nextInt();
             menor = notas [0];
             mayor = notas [0];
            if (notas[i]<0||notas[i]>10) {
                System.out.println("Notas no validas");
                return;
            }
            if (notas[i]>mayor) {
                mayor = notas [i];
            }
            if (notas[i]<menor) {
                menor = notas[i];
            }
            media += notas[i]/5; 
        }
        for (int j=0;j<notas.length;j++){
            System.out.println("notas:" +notas[j] );
        }
       System.out.println("La media de las notas fue: "+media+" la nota menor fue: "+menor+" la notas mayor fue: "+mayor); 
    }
}
