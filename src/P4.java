import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P4 {
    public static void main(String[] args) {
        // Define the input relationships
        String[][] relationships = {
            {"luke", "shaw"},
            {"wayne", "rooney"},
            {"rooney", "ronaldo"},
            {"shaw", "rooney"}
        };
        
        // Define the target person
        String target = "ronaldo";
        
        // Create a HashMap to store father to children relationships
        HashMap<String, List<String>> fatherToChildren = new HashMap<>();
        
        // Populate the HashMap with the relationships
        for (String[] relationship : relationships) {
            String child = relationship[0];
            String father = relationship[1];
            
            fatherToChildren.computeIfAbsent(father, k -> new ArrayList<>()).add(child);
        }
        
        // Find the children of the target person
        List<String> children = fatherToChildren.get(target);
        int grandchildrenCount = 0;
        
        if (children != null) {
            // For each child, find their children (grandchildren of the target person)
            for (String child : children) {
                List<String> grandchildren = fatherToChildren.get(child);
                if (grandchildren != null) {
                    grandchildrenCount += grandchildren.size();
                }
            }
        }
        
        // Output the number of grandchildren
        System.out.println("Number of grandchildren of " + target + ": " + grandchildrenCount);
    }
}


// Given a two dimensional array of string like

//   <”luke”, “shaw”>
//   <”wayne”, “rooney”>
//   <”rooney”, “ronaldo”>
//   <”shaw”, “rooney”> 
// Where the first string is “child”, second string is “Father”. And given “ronaldo” we have to find his no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.

// To solve this problem efficiently, you can use a HashMap to store the relationships between children and fathers. This way, you can easily traverse the relationships to find the number of grandchildren for a given person. 

// Explanation:
// Data Representation:

// We use a 2D array relationships to store the child-father pairs.
// HashMap to Store Relationships:

// We create a HashMap called fatherToChildren where the key is the father's name, and the value is a list of children.
// We populate this map using the relationships array.
// Finding Grandchildren:

// We find the children of the target person (ronaldo in this case) by looking up the target person's key in the HashMap.
// For each child, we then find their children (grandchildren of the target person) by looking them up in the HashMap.
// We count the total number of grandchildren.
// Output:

// Finally, we print the number of grandchildren.
// This solution is efficient because it uses a HashMap for quick lookups and simple list operations to count the grandchildren. The time complexity is linear with respect to the number of relationships, making it suitable for large inputs.
