public class P14 {

    // Helper method to reverse words recursively
    private static void reverseWords(String str, int index) {
        // Base case: if index is less than 0, return
        if (index < 0) {
            return;
        }

        // Find the end of the current word
        int end = index;
        while (end >= 0 && str.charAt(end) != ' ') {
            end--;
        }

        // Print the current word
        System.out.print(str.substring(end + 1, index + 1) + " ");

        // Recursive call to print the rest of the string
        reverseWords(str, end - 1);
    }

    public static void main(String[] args) {
        String input1 = "one two three";
        String input2 = "I love india";

        System.out.println("Original: " + input1);
        System.out.print("Reversed: ");
        reverseWords(input1, input1.length() - 1);
        System.out.println();

        System.out.println("Original: " + input2);
        System.out.print("Reversed: ");
        reverseWords(input2, input2.length() - 1);
        System.out.println();
    }
}


// Using Recursion reverse the string such as

// Eg 1: Input: one two three
//       Output: three two one
// Eg 2: Input: I love india
//       Output: india love I 

/* Explanation
reverseWords Method:

Base Case: If the index is less than 0, it means we have processed all the words, so we return.
Finding the End of the Current Word: We start from the given index and move backward to find the first space character, which marks the end of the current word.
Printing the Current Word: We use substring to extract and print the current word.
Recursive Call: We call reverseWords recursively with the index just before the space character.
main Method:

We define two sample input strings.
We print the original strings.
We call reverseWords with the string and its last index to start the recursion.
We print the reversed strings.
Output
makefile
Copy code
Original: one two three
Reversed: three two one 
Original: I love india
Reversed: india love I 
This program is simple, easy to understand, and efficient for reversing the words in a string using recursion. */


