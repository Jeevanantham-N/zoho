import java.util.Stack;

public class P6 {
    public static void main(String[] args) {
        String input1 = "((abc)((de))";
        String input2 = "(((ab)";
        System.out.println("Input: " + input1 + " -> Output: " + removeUnbalancedParentheses(input1));
        System.out.println("Input: " + input2 + " -> Output: " + removeUnbalancedParentheses(input2));
    }

    public static String removeUnbalancedParentheses(String expression) {
        Stack<Integer> stack = new Stack<>();
        boolean[] toRemove = new boolean[expression.length()];

        // Traverse the expression and mark unbalanced parentheses
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    toRemove[i] = true; // Mark unbalanced ')'
                } else {
                    stack.pop();
                }
            }
        }

        // Mark remaining unbalanced '(' in the stack
        while (!stack.isEmpty()) {
            toRemove[stack.pop()] = true;
        }

        // Build the result string excluding the marked characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            if (!toRemove[i]) {
                result.append(expression.charAt(i));
            }
        }

        return result.toString();
    }
}

// Remove unbalanced parentheses in a given expression.

//     Eg.) Input  : ((abc)((de))
//          Output : ((abc)(de))  

//          Input  : (((ab)
//          Output : (ab) 

// Explanation:
// Stack for Tracking Parentheses:

// A Stack<Integer> is used to keep track of the indices of the opening parentheses (.
// Marking Unbalanced Parentheses:

// Traverse the expression character by character.
// Push the index of each opening parenthesis ( onto the stack.
// For each closing parenthesis ), check if the stack is empty:
// If empty, mark this closing parenthesis as unbalanced.
// If not empty, pop from the stack (this indicates a balanced pair).
// Mark Remaining Unbalanced Opening Parentheses:

// After the first traversal, any remaining indices in the stack correspond to unbalanced opening parentheses (, which are marked as unbalanced.
// Building the Result String:

// Construct a new string by including only the characters that are not marked as unbalanced.
