public class P3 {
    public static void main(String[] args) {
        String input = "WELCOMETOZOHOCORPORATION";
        char[][] matrix = new char[5][5];
        String searchString = "TOO";

        // Fill the matrix with the input string
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (index < input.length()) {
                    matrix[i][j] = input.charAt(index++);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        // Print the matrix (optional)
        System.out.println("Matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search for the substring
        boolean found = false;
        int[] start = new int[2];
        int[] end = new int[2];

        // Search from left to right
        outer: for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5 - searchString.length(); j++) {
                if (matrix[i][j] == searchString.charAt(0) &&
                    matrix[i][j + 1] == searchString.charAt(1) &&
                    matrix[i][j + 2] == searchString.charAt(2)) {
                    start[0] = i + 1;
                    start[1] = j + 1;
                    end[0] = i + 1;
                    end[1] = j + 3;
                    found = true;
                    break outer;
                }
            }
        }

        // Search from top to bottom if not found yet
        if (!found) {
            outer: for (int j = 0; j < 5; j++) {
                for (int i = 0; i <= 5 - searchString.length(); i++) {
                    if (matrix[i][j] == searchString.charAt(0) &&
                        matrix[i + 1][j] == searchString.charAt(1) &&
                        matrix[i + 2][j] == searchString.charAt(2)) {
                        start[0] = i + 1;
                        start[1] = j + 1;
                        end[0] = i + 3;
                        end[1] = j + 1;
                        found = true;
                        break outer;
                    }
                }
            }
        }

        if (found) {
            System.out.println("Start index: <" + start[0] + "," + start[1] + "> End index: <" + end[0] + "," + end[1] + ">");
        } else {
            System.out.println("Substring not found.");
        }
    }
}

// Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.

// w    e    L    C    O
// M    E    T    O    Z
// O    H    O    C    O
// R    P    O    R    A
// T    I    O    n      
// And print the start and ending index as Start index : <1,2> End index: <3, 2>

// Explanation:
// Matrix Filling:

// The input string "WELCOMETOZOHOCORPORATION" is filled into a 5x5 matrix.
// If the input string is shorter than 25 characters, remaining cells are filled with spaces.
// Matrix Printing (optional):

// The matrix is printed for visual verification.
// Searching the Substring:

// First, the code searches for the substring from left to right in each row.
// If not found, it then searches from top to bottom in each column.
// If the substring is found, the start and end indices are calculated and printed.
// The indices are adjusted to be 1-based as specified in the problem statement.
// Output:

// The start and end indices are printed if the substring is found.
// If not found, a message is displayed stating that the substring is not found.
// The checkSubstring method checks whether the substring matches horizontally or vertically, depending on the boolean parameter horizontal. This makes the code efficient and easy to understand.