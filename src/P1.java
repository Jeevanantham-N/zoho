public class P1 {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int length = word.length();
        
        // Print each row
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i || j == length - 1 - i) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// 1. Print the word with odd letters as

// P         M
//  R      A
//    O  R
//      G
//   O    R
//  R       A
// P          M 