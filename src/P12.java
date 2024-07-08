public class P12 {
    public static void main(String[] args) {
        String string1_1 = "test123string";
        String string1_2 = "123";

        String string2_1 = "testing12";
        String string2_2 = "1234";

        System.out.println("Input: String 1: " + string1_1 + ", String 2: " + string1_2);
        System.out.println("Output: " + findSubstring(string1_1, string1_2));

        System.out.println("Input: String 1: " + string2_1 + ", String 2: " + string2_2);
        System.out.println("Output: " + findSubstring(string2_1, string2_2));
    }

    public static int findSubstring(String str1, String str2) {
        return str1.indexOf(str2);
    }
}

// 4. Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

// Eg 1:Input:
//         String 1: test123string
//          String 2: 123
//         Output: 4
// Eg 2: Input:
//         String 1: testing12
//         String 2: 1234 
//         Output: -1

//         Explanation
//         Main Method:
        
//         The main method defines input strings and prints the output of the findSubstring method for each pair of inputs.
//         findSubstring Method:
        
//         The indexOf method is called on str1 with str2 as the argument.
//         indexOf returns the index of the first occurrence of str2 in str1.
//         If str2 is not found in str1, indexOf returns -1.
//         Output
//         For the input:
        
//         String 1: "test123string", String 2: "123"
        
//         The output will be 4 because "123" starts at index 4 in "test123string".
//         String 1: "testing12", String 2: "1234"
        
//         The output will be -1 because "1234" is not a substring of "testing12".
//         This code is efficient and easy to understand, making use of Java's built-in methods to achieve the desired result.
        