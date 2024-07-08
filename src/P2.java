public class P2 {
    public static void main(String[] args) {
        int[] numbers = {10, 36, 54, 89, 12};
        int sumOfWeights = 0;

        for (int number : numbers) {
            sumOfWeights += calculateWeight(number);
        }

        System.out.println("Sum of weights: " + sumOfWeights);
    }

    private static int calculateWeight(int number) {
        int weight = 0;

        // Check if the number is a perfect square
        if (isPerfectSquare(number)) {
            weight += 5;
        }

        // Check if the number is a multiple of 4 and divisible by 6
        if (number % 4 == 0 && number % 6 == 0) {
            weight += 4;
        }

        // Check if the number is even
        if (number % 2 == 0) {
            weight += 3;
        }

        return weight;
    }

    private static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}

// 2. Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions:   

// 1. 5 if a perfect square     
// 2. 4 if multiple of 4 and divisible by 6
// 3. 3 if even number

// And sort the numbers based on the weight and print it as follows <10,its_weight>,<36,its weight><89,its weight> Should display the numbers based on increasing order