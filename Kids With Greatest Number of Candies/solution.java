import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Determine if each child can have the greatest number of candies by adding extra candies.
     *
     * @param candies      An array representing the number of candies each child has.
     * @param extraCandies An integer representing the extra candies to be added to each child's candies.
     * @return A list of booleans indicating if each child can have the greatest number of candies.
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Initialize the result list to store boolean values.
        List<Boolean> result = new ArrayList<>();

        // Find the maximum number of candies among all children.
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        // Compare each child's candies with the maximum (after adding extra candies).
        for (int i = 0; i < candies.length; i++) {
            int currCandies = candies[i] + extraCandies;
            if (currCandies >= max) {
                result.add(true); // The child can have the greatest number of candies.
            } else {
                result.add(false); // The child cannot have the greatest number of candies.
            }
        }

        return result;
    }
}
