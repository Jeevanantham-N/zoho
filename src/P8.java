import java.util.Stack;

public class P8 {
    public static void main(String[] args) {
        String expression1 = "(a+b)(a*b)";
        String expression2 = "(ab)(ab+)";
        String expression3 = "((a+b)";

        System.out.println("Input: " + expression1 + " -> Output: " + isValidExpression(expression1));
        System.out.println("Input: " + expression2 + " -> Output: " + isValidExpression(expression2));
        System.out.println("Input: " + expression3 + " -> Output: " + isValidExpression(expression3));
    }

    public static String isValidExpression(String expression) {
        if (!areParenthesesBalanced(expression)) {
            return "Invalid";
        }

        if (!areOperatorsUsedCorrectly(expression)) {
            return "Invalid";
        }

        return "Valid";
    }

    private static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    private static boolean areOperatorsUsedCorrectly(String expression) {
        String operators = "+-*/";

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (operators.indexOf(ch) != -1) {
                // Check if an operator is at the start or end of the expression
                if (i == 0 || i == expression.length() - 1) {
                    return false;
                }
                // Check if there are consecutive operators
                if (operators.indexOf(expression.charAt(i - 1)) != -1 || operators.indexOf(expression.charAt(i + 1)) != -1) {
                    return false;
                }
            }
        }

        return true;
    }
}


// Check whether a given mathematical expression is valid.

//     Eg.) Input  : (a+b)(a*b)
//          Output : Valid

//          Input  : (ab)(ab+)
//          Output : Invalid

//          Input  : ((a+b)
//          Output : Invalid 

// Explanation:
// isValidExpression Method:

// Combines the checks for balanced parentheses and correct operator usage.
// Returns "Invalid" if either check fails, otherwise returns "Valid".
// areParenthesesBalanced Method:

// Uses a stack to ensure that each opening parenthesis '(' has a corresponding closing parenthesis ')'.
// Returns false if parentheses are not balanced, true otherwise.
// areOperatorsUsedCorrectly Method:

// Checks for operators at the start or end of the expression.
// Checks for consecutive operators.
// Uses a string operators to check if a character is an operator.
// Returns false if any of the conditions fail, true otherwise.
