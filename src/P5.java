import java.util.Arrays;

public class P5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = alternateSort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] alternateSort(int[] array) {
        // Sort the array
        Arrays.sort(array);

        // Create a result array to store the sorted elements
        int[] result = new int[array.length];

        // Initialize pointers for max and min elements
        int maxIndex = array.length - 1;
        int minIndex = 0;

        // Fill the result array with max and min elements alternately
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result[i] = array[maxIndex--];
            } else {
                result[i] = array[minIndex++];
            }
        }

        return result;
    }
}


// 1) Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.

//     Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
//          Output : {7, 1, 6, 2, 5, 3, 4} 

// Explanation:
// Sorting the Array:

// The array is first sorted in ascending order using Arrays.sort(array).
// Creating the Result Array:

// We create a new array result to store the elements in the desired order.
// Using Pointers:

// We use two pointers: maxIndex starting from the end of the sorted array (for maximum elements) and minIndex starting from the beginning (for minimum elements).
// Filling the Result Array:

// We iterate through the indices of the result array. For even indices, we assign the current maximum element (pointed by maxIndex), and for odd indices, we assign the current minimum element (pointed by minIndex).
// Returning the Result Array:

// Finally, we return the result array.
