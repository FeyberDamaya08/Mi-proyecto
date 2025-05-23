public class ejerArray11 {
    public static void main(String[] args) {
    int [][] diagonal = {
        {1,0,0,0,0},
        {0,1,0,0,0},
        {0,0,1,0,0},
        {0,0,0,1,0},
        {0,0,0,0,1}
    };
     for (int i=0;i<5;i++){

        for (int o=0;o<5;o++){
            System.out.print(diagonal [i][o]);



        }
        System.out.println();
     }
        
    }
    
}
