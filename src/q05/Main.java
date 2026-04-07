import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.next();
        
        if (shape.equals("circle")) {
            double r = sc.nextDouble();
            double area = Math.PI * r * r;
            System.out.printf("Area: %.2f\n", area);
        } 
        else if (shape.equals("rectangle")) {
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            double area = l * w;
            System.out.printf("Area: %.2f\n", area);
        }
        else if (shape.equals("triangle")) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double s = (a + b + c) / 2.0;  // semi-perimeter
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area: %.2f\n", area);
        }
        
        sc.close();
    }
}

        // TODO: Compute area using the correct formula
        //
        //   circle    r         → area = π * r * r          (use Math.PI)
        //   rectangle l w       → area = l * w
        //   triangle  a b c     → Heron's formula: s=(a+b+c)/2, area=sqrt(s(s-a)(s-b)(s-c))
        //
        // Print: "Area: X.XX"  (exactly 2 decimal places)
        //
        // Input: circle 7      → Output: Area: 153.94
        // Input: rectangle 4 6 → Output: Area: 24.00
        // Input: triangle 3 4 5→ Output: Area: 6.00

    

