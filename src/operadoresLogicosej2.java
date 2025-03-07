public class operadoresLogicosej2 {
        public static void main(String[] args) {
            Byte a = 10;
            Byte b = 5;
            Byte c = 20;
    
            System.out.println("a > b && b < c: " + (a > b && b < c)); 
            System.out.println("a < b || b > c: " + (a < b || b > c)); 
            System.out.println("!(a > b): " + !(a > b)); 
        }
    }
