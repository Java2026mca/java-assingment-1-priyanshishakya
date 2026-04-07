import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
      
        for (int row = 0; row < n; row++) {
            int prevAboveLeft = 1;
            int prevAboveRight = 1;
            
         
            System.out.print("1");
            
           
            for (int j = 1; j < row; j++) {
                int current = prevAboveLeft + prevAboveRight;
                System.out.print(" " + current);
                prevAboveLeft = prevAboveRight;
                prevAboveRight = current;
            }
            
          
            if (row > 0) {
                System.out.print(" 1");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}
