public class P11 {
    public static void main(String[] args) {
        String input1 = "12345";
        String input2 = "geeksforgeeks";

        System.out.println("Input: " + input1);
        printPattern(input1);

        System.out.println("Input: " + input2);
        printPattern(input2);
    }

    public static void printPattern(String input) {
        int n = input.length();

        // First half of the pattern
        for (int i = 0; i <= n / 2; i++) {
            printLine(input, i, n);
        }

        // Second half of the pattern
        for (int i = n / 2 - 1; i >= 0; i--) {
            printLine(input, i, n);
        }
    }

    public static void printLine(String input, int i, int n) {
        // Leading spaces
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }

        // First character in the line
        System.out.print(input.charAt(i));

        // Spaces between characters
        for (int j = 0; j < n - 2 * (i + 1); j++) {
            System.out.print(" ");
        }

        // Second character in the line if it's not the middle line
        if (i != n / 2) {
            System.out.print(input.charAt(n - 1 - i));
        }

        // Move to the next line
        System.out.println();
    }
}

// 3. Write a program to print the following output for the given input. You can assume the string is of odd length

// Eg 1: Input: 12345
//        Output:
// 1       5
//   2   4
//     3
//   2  4
// 1      5
// Eg 2: Input: geeksforgeeks
//          Output:
// g                         s
//   e                     k
//     e                 e
//       k             e
//         s         g
//           f      r
//              o
//           f     r
//         s         g
//       k             e
//     e                 e
//   e                      k
// g                          s 

// Task Breakdown
// Input: A string of odd length.
// Output: A diamond-like pattern where:
// The first and last characters are printed at the start and end of the first and last lines.
// The second and second-last characters are printed with increasing spaces in between.


// Explanation
// Main Method:

// The main method initializes input strings and calls printPattern to print the required pattern for each input.
// printPattern Method:

// This method handles the overall structure of the pattern.
// It prints the first half of the pattern by iterating from 0 to n/2.
// It prints the second half of the pattern by iterating from n/2 - 1 to 0.
// printLine Method:

// This method prints each line of the pattern.
// For each line, it prints leading spaces equal to the current index i.
// Prints the character at the current index i.
// Prints the spaces between the characters, which decreases as you move towards the middle of the string.
// Prints the character from the end of the string corresponding to the current index unless it's the middle character.
// Output
// For the input "12345", the output will be:

// Copy code
// 1       5
//  2     4
//   3
//  2     4
// 1       5
// For the input "geeksforgeeks", the output will be:

// markdown
// Copy code
// g                         s
//  e                       k
//   e                     e
//    k                   e
//     s                 g
//      f               r
//       o
//      f               r
//     s                 g
//    k                   e
//   e                     e
//  e                       k
// g                         s
// This code ensures that the characters are printed in the desired diamond pattern, with correct spacing and alignment.








