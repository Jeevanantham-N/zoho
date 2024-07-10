public class P19 {
    public static int largestSumNonAdjacent(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int incl = 0;  // Max sum including the current element
        int excl = 0;  // Max sum excluding the current element

        for (int num : nums) {
            int newExcl = Math.max(incl, excl);
            incl = excl + num;
            excl = newExcl;
        }

        return Math.max(incl, excl);
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4, 6, 2, 5};
        System.out.println(largestSumNonAdjacent(nums1));  // Output: 13

        int[] nums2 = {5, 1, 1, 5};
        System.out.println(largestSumNonAdjacent(nums2));  // Output: 10

        int[] nums3 = {-2, 1, 3, -4, 5};
        System.out.println(largestSumNonAdjacent(nums3));  // Output: 8
    }
}

/* 5.This problem was asked by Airbnb.
 Given a list of integers, write a function that returns the largest sum of non
adjacent numbers. Numbers can be 0 or negative.
 For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 
1, 5] should return 10, since we pick 5 and 5.
 Follow-up: Can you do this in O(N) time and constant space? */