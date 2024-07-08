import java.util.ArrayList;
import java.util.List;

public class P13 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] array2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.print("Merged array: ");
        printArray(mergedArray);
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        List<Integer> resultList = new ArrayList<>();
        
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (resultList.isEmpty() || resultList.get(resultList.size() - 1) != arr1[i]) {
                    resultList.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (resultList.isEmpty() || resultList.get(resultList.size() - 1) != arr2[j]) {
                    resultList.add(arr2[j]);
                }
                j++;
            } else { // arr1[i] == arr2[j]
                if (resultList.isEmpty() || resultList.get(resultList.size() - 1) != arr1[i]) {
                    resultList.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements from array1
        while (i < arr1.length) {
            if (resultList.isEmpty() || resultList.get(resultList.size() - 1) != arr1[i]) {
                resultList.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from array2
        while (j < arr2.length) {
            if (resultList.isEmpty() || resultList.get(resultList.size() - 1) != arr2[j]) {
                resultList.add(arr2[j]);
            }
            j++;
        }

        // Convert List<Integer> to int[]
        int[] mergedArray = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            mergedArray[k] = resultList.get(k);
        }

        return mergedArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}


// 5. Given two sorted arrays, merge them such that the elements are not repeated

// Eg 1: Input:
//         Array 1: 2,4,5,6,7,9,10,13
//         Array 2: 2,3,4,5,6,7,8,9,11,15
//        Output:
//        Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 

// Explanation
// Main Method:

// The main method defines two sorted arrays array1 and array2.
// It calls the mergeArrays method to merge these arrays while ensuring uniqueness of elements.
// mergeArrays Method:

// Uses two pointers i and j to iterate through arr1 and arr2 respectively.
// Compares elements pointed by i and j:
// If arr1[i] < arr2[j], add arr1[i] to the resultList.
// If arr1[i] > arr2[j], add arr2[j] to the resultList.
// If arr1[i] == arr2[j], add either arr1[i] or arr2[j] to the resultList (ensuring uniqueness).
// After merging, adds remaining elements from arr1 and arr2 to the resultList.
// Converts resultList to an int[] array mergedArray and returns it.
// printArray Method:

// Helper method to print the elements of an array.
// Output
// For the input:

// Array 1: {2, 4, 5, 6, 7, 9, 10, 13}
// Array 2: {2, 3, 4, 5, 6, 7, 8, 9, 11, 15}
// The output will be:

// c
// Copy code
// Merged array: 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15
// This code efficiently merges two sorted arrays into a single sorted array with unique elements, using a straightforward approach leveraging list operations for simplicity and clarity.
