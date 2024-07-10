public class P16 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate the products of all elements to the left of each index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Step 2: Calculate the products of all elements to the right of each index
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] result1 = productExceptSelf(nums1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();  // Output: 120 60 40 30 24

        int[] nums2 = {3, 2, 1};
        int[] result2 = productExceptSelf(nums2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();  // Output: 2 3 6
    }
}

/* Given an array of integers, return a new array such that each element at 
index i of the new array is the product of all the numbers in the original array 
except the one at i.
 For example, if our input was [1, 2, 3, 4, 5], the expected output would 
be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would 
be [2, 3, 6] */