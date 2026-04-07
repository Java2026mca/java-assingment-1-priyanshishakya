import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            boolean isPrime = isPrime(num);
            boolean isPerfect = isPerfect(num);
            
            if (isPrime && isPerfect) {
                System.out.println("Both");
            } else if (isPrime) {
                System.out.println("Prime");
            } else if (isPerfect) {
                System.out.println("Perfect");
            } else {
                System.out.println("Neither");
            }
        }
        
        sc.close();
    }
    
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    private static boolean isPerfect(int num) {
        if (num < 1) return false;
        
        int sum = 1;  
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i && num / i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}

        // TODO: Read n integers. For each number print:
        //   "Prime"     if it is prime
        //   "Perfect"   if it is a perfect number (sum of proper divisors == itself, e.g. 6=1+2+3)
        //   "Both"      if it is both (there are none < 100, but handle it)
        //   "Neither"   otherwise
        //
        // Input:
        // 4
        // 6 13 8 28
        //
        // Output:
        // Perfect
        // Prime
        // Neither
        // Perfect

    

