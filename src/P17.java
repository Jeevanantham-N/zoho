public class P17 {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct position if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find the first index which does not have the correct number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are in their correct positions, return n + 1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums1));  // Output: 2

        int[] nums2 = {1, 2, 0};
        System.out.println(firstMissingPositive(nums2));  // Output: 3
    }
}


/* 3.Given an array of integers, find the first missing positive integer in linear 
time and constant space. In other words, find the lowest positive integer that 
does not exist in the array. The array can contain duplicates and negative 
numbers as well.
 For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should 
give 3 */