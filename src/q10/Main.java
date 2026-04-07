import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tokens = line.split(" ");
        
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperator(token, a, b);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        System.out.println(stack.pop());
        sc.close();
    }
    
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    
    private static int applyOperator(String operator, int a, int b) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

        // TODO: Evaluate a postfix (Reverse Polish Notation) expression
        //       Operands are non-negative integers, operators are: + - * /
        //       Use a stack to evaluate
        //       Input: single line, tokens separated by spaces
        //       Output: integer result
        //
        // Input: 5 1 2 + 4 * + 3 -
        // Output: 14
        //
        // Explanation: 5 + ((1+2)*4) - 3 = 5 + 12 - 3 = 14

       
