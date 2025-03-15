import java.util.Scanner;

public class numerosAmigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa el numero dl inicio");
        int inicio = input.nextInt();
        System.out.println("Ingresa el numero fin");
        int fin = input.nextInt();
        
        if (inicio>fin){
            System.out.println("Entrada no valida");
            input.close();
        }
        boolean encontrado = false;
        for (int i=Math.max(2,inicio);i<6;i++){
         int contadorDivisores =0;
         int primerDivisor =0;
         int segundoDivisor=0;
        
        for (int j=2;j<=i;j++){
            if (i%j==0){
        contadorDivisores ++;
        if(contadorDivisores==1){
            primerDivisor++;
        } else if (contadorDivisores==2){
          segundoDivisor++;  
        } else {
            break;
        }  
    }
   }
}
        if (contadorDivisores==2) {
            encontrado=true;
            System.out.println(i+"numero amigo"+primerDivisor+segundoDivisor);
        }
      
    if (!encontrado) {
        System.out.println("No se encontraron amigos");
    }
    input.close();            
    

}
}
