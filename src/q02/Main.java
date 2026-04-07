import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int row = 0; row < n; row++) {
            
            int current = 1;
            System.out.print(current);
            
           
            for (int col = 1; col < row; col++) {
                current = current * (row - col) / col;
                System.out.print(" " + current);
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}

        // TODO: Print Pascal's Triangle for n rows
        //       Values on each row separated by single space
        //       No leading or trailing spaces
        //
        // Input: 5
        // Output:
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1

    
