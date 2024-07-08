// Task Explanation
// You need to sort the elements of an array such that:

// Elements at odd indices (1st, 3rd, 5th, etc.) are sorted in descending order.
// Elements at even indices (2nd, 4th, 6th, etc.) are sorted in ascending order.
// For example:

// Input: 13, 2, 4, 15, 12, 10, 5 -> split into odd and even positions like this  13,4,12,5 & 2,15,10
// Output: 13, 2, 12, 10, 5, 15, 4
// Simplified Steps
// Separate the elements at odd and even positions.
// Sort the odd-positioned elements in descending order.
// Sort the even-positioned elements in ascending order.
// Merge the sorted lists back into the original array.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P10 {
    public static void main(String[] args) {
        int[] input1 = {13, 2, 4, 15, 12, 10, 5};
        int[] input2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Input: 13, 2, 4, 15, 12, 10, 5 -> Output: " + sortOddEven(input1));
        System.out.println("Input: 1, 2, 3, 4, 5, 6, 7, 8, 9 -> Output: " + sortOddEven(input2));
    }

    public static String sortOddEven(int[] arr) {
        List<Integer> oddPos = new ArrayList<>();
        List<Integer> evenPos = new ArrayList<>();

        // Separate elements into odd and even position lists
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                oddPos.add(arr[i]);
            } else {
                evenPos.add(arr[i]);
            }
        }

        // Sort odd position elements in descending order
        Collections.sort(oddPos, Collections.reverseOrder());
        // Sort even position elements in ascending order
        Collections.sort(evenPos);

        // Merge the sorted lists back into the original array
        StringBuilder result = new StringBuilder();
        int oddIndex = 0, evenIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result.append(oddPos.get(oddIndex++)).append(", ");
            } else {
                result.append(evenPos.get(evenIndex++)).append(", ");
            }
        }

        // Remove the last comma and space
        result.setLength(result.length() - 2);
        return result.toString();
    }
}


// 2. Write a program to sort the elements in odd positions in descending order and elements in ascending order

// Eg 1: Input: 13,2 4,15,12,10,5
//         Output: 13,2,12,10,5,15,4
// Eg 2: Input: 1,2,3,4,5,6,7,8,9
//         Output: 9,2,7,4,5,6,3,8,1 

// Explanation:
// Main Method:

// The main method defines input arrays and prints the output of the sortOddEven method for each input.
// sortOddEven Method:

// Two lists, oddPos and evenPos, are created to store elements at odd and even positions, respectively.
// A loop iterates through the array:
// If the index is even, the element is added to oddPos.
// If the index is odd, the element is added to evenPos.
// oddPos is sorted in descending order using Collections.sort with Collections.reverseOrder().
// evenPos is sorted in ascending order using Collections.sort.
// The sorted elements are merged back into the original positions of the array using two indices, oddIndex and evenIndex.
// StringBuilder for Result:

// A StringBuilder is used to construct the final result string by appending elements in the required order.
// The last comma and space are removed for proper formatting before returning the result.
