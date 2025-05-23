import java.util.Scanner;

public class ejerArra8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] nombre = new String[100];
        int [] edades = new int[100];
        String [] mayores = new String[100];
        int edad=0;
        int i=0;
        int o=0;
       do {
        System.out.println("Digite el nombre del estudiante:");
        nombre [i] = input.next();
        System.out.println("Digite la edad del estudiante:");
        edades [i] = input.nextInt();
        if (edades[i]>=18) {
         mayores[o]=nombre[i];
         o++;
        }
        i++;
       } while ((!nombre[i].equals("*"))); 
       for (int z=0;z<mayores.length;z++){
       System.out.println("los alumno mayores fueron: "+mayores[z]);


       }
        
        
            
        
    }
}
