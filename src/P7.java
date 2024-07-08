import java.util.LinkedList;
import java.util.Queue;

public class P7 {
    public static void main(String[] args) {
        int n = 10; // Example: Find the 10th number
        System.out.println("The " + n + "th number in the system is: " + findNthNumber(n));
    }

    public static String findNthNumber(int n) {
        if (n <= 0) {
            return "";
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("3");
        queue.add("4");

        String current = "";
        for (int i = 0; i < n; i++) {
            current = queue.poll();
            queue.add(current + "3");
            queue.add(current + "4");
        }

        return current;
    }
}

// Form a number system with only 3 and 4. Find the nth number of the number system.
// Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….

// Explanation:
// Queue for BFS:

// A Queue<String> is used to facilitate the BFS, ensuring that numbers are generated in lexicographical order.
// Initialize the Queue:

// Start by adding the first two numbers "3" and "4" to the queue.
// Generating Numbers:

// For each iteration up to n, remove the front of the queue (poll).
// Append "3" and "4" to the current number and add these new numbers back into the queue.
// The poll operation gives us the current smallest number in the system, and appending "3" and "4" to it generates the next possible numbers in lexicographical order.
// Return the nth Number:

// After n iterations, the current number (poll result) is the nth number in the system.