import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n >= 1) {
            System.out.print("0");
        }
        if (n >= 2) {
            System.out.print(" 1");
        }
        
        if (n <= 2) {
            System.out.println();
            sc.close();
            return;
        }
        
        // Generate Fibonacci numbers from F(2) onwards
        long prev = 0; 
        long curr = 1;  
        
        for (int i = 2; i < n; i++) {
            long next = prev + curr;
            System.out.print(" " + next);
            prev = curr;
            curr = next;
        }
        
        System.out.println();
        sc.close();
    }
}
        // TODO: Print first n Fibonacci numbers separated by spaces
        //       F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2)
        //
        // Input: 8
        // Output: 0 1 1 2 3 5 8 13

 

