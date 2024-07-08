public class P9 {
    public static void main(String[] args) {
        String input1 = "a1b10";
        String input2 = "b3c6d15";
        
        System.out.println("Input: " + input1 + " -> Output: " + processInput(input1));
        System.out.println("Input: " + input2 + " -> Output: " + processInput(input2));
    }

    public static String processInput(String input) {
        StringBuilder output = new StringBuilder();
        
        // To store the current letter and its count
        char currentChar = 0;
        int number = 0;

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If the character is a letter
            if (Character.isLetter(ch)) {
                // Append the previous letter `number` times to the output
                if (currentChar != 0) {
                    for (int j = 0; j < number; j++) {
                        output.append(currentChar);
                    }
                }
                // Update the current letter and reset the number
                currentChar = ch;
                number = 0;
            } 
            // If the character is a digit
            else if (Character.isDigit(ch)) {
                // Construct the number (in case of multi-digit numbers)
                number = number * 10 + (ch - '0');
            }
        }
        
        // Append the last letter `number` times to the output
        for (int j = 0; j < number; j++) {
            output.append(currentChar);
        }

        return output.toString();
    }
}



// 1. Write a program to give the following output for the given input

// Eg 1: Input: a1b10
//        Output: abbbbbbbbbb
// Eg: 2: Input: b3c6d15
//           Output: bbbccccccddddddddddddddd
// The number varies from 1 to 99.

// Explanation:
// Input Handling:

// The input strings are defined and processed by the processInput method.
// Initialization:

// A StringBuilder is used to construct the output string efficiently.
// Variables currentChar and number are initialized to track the current letter and its associated number.
// The index i is used to iterate through the input string.
// Iterating Through the Input:

// For each character in the input string:
// If it's a letter:
// Append the previous currentChar to the output number times.
// Update currentChar to the new letter.
// Reset number to 0.
// If it's a digit:
// Construct the number by multiplying the current number by 10 and adding the new digit.
// Appending the Last Character:

// After the loop, append the last currentChar to the output number times.
// Return the Result:

// The final constructed output string is returned.