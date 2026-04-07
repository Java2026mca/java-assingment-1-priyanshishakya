import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int row = 0; row < n; row++) {
            // Print left 1
            System.out.print("1");
            
            // Print middle using binomial coefficient property
            for (int j = 1; j < row; j++) {
                // C(row, j) = row! / (j! * (row-j)!)
                // Use multiplicative formula to avoid overflow
                long current = 1L * (row - j + 1) / j * prev;
                System.out.print(" " + current);
                prev = current;
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
