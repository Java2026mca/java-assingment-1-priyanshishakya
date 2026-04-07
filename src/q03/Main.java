import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, bottom = n-1, left = 0, right = n-1;
        
     
        while (num <= n*n) {
            for (int col = left; col <= right && num <= n*n; col++) {
                matrix[top][col] = num++;
            }
            top++;
            
            
            for (int row = top; row <= bottom && num <= n*n; row++) {
                matrix[row][right] = num++;
            }
            right--;
            
            
            for (int col = right; col >= left && num <= n*n; col--) {
                matrix[bottom][col] = num++;
            }
            bottom--;
            
        
            for (int row = bottom; row >= top && num <= n*n; row--) {
                matrix[row][left] = num++;
            }
            left++;
        }
        
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j < n-1) System.out.print(" ");
            }
            System.out.println();
        }
        
        
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println("Diagonal: " + diagonalSum);
        
        sc.close();
    }
}
