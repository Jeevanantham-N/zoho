public class P18 {
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // An empty string has one way to be decoded

        // Initialize the first character
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= n; i++) {
            // Check the single digit
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
            // Check the two digits
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("111"));  // Output: 3
        System.out.println(numDecodings("226"));  // Output: 3
        System.out.println(numDecodings("10"));   // Output: 1
    }
}

/* 4.Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count 
the number of ways it can be decoded.
 For example, the message '111' would give 3, since it could be decoded as 
'aaa', 'ka', and 'ak'.
 You can assume that the messages are decodable. For example, '001' is not 
allowed. */