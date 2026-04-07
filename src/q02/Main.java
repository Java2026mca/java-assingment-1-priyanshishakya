import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int row = 0; row < n; row++) {
            long c = 1;  // Current binomial coefficient
            
            // Print left 1
            System.out.print("1");
            
            // Print middle coefficients
            for (int j = 1; j <= row/2; j++) {
                // C(row, j) = C(row, j-1) * (row-j+1) / j
                c = c * (row - j + 1) / j;
                System.out.print(" " + c);
            }
            
            // Print right half (symmetric) - skip middle for odd rows
            for (int j = row/2 + 1; j < row; j++) {
                System.out.print(" " + c);
                c = c * j / (row - j + 1);
            }
            
            // Print right 1
            if (row > 0) {
                System.out.print(" 1");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}
