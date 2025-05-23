public class ejerArray12 {
    public static void main(String[] args) {
        int [][] marco = { 
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}

        };
        for (int i=0;i<5;i++){

            for ( int j=0;j<15;j++){
            
                System.out.print(marco[i][j]);



            }
         System.out.println();


        }
    }
}
