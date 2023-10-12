class Solution {
    /**
     * Merge two strings alternately, starting with word1.
     *
     * @param word1 The first string to be merged.
     * @param word2 The second string to be merged.
     * @return The merged string.
     */
    public String mergeAlternately(String word1, String word2) {
        // Initialize a StringBuilder to store the merged result.
        StringBuilder result = new StringBuilder();
        
        // Initialize an index variable to iterate through the strings.
        int i = 0;
        
        // Continue iterating as long as there are characters in either of the strings.
        while (i < word1.length() || i < word2.length()) {
            // Append the character from word1 if it exists at the current index.
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            
            // Append the character from word2 if it exists at the current index.
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            
            // Move to the next index.
            i++;
        }
        
        // Convert the StringBuilder to a String and return the merged result.
        return result.toString();
    }
}
