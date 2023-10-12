class Solution {
    /**
     * Reverse the words in a string.
     *
     * @param s The input string containing words to be reversed.
     * @return The reversed string with words in reverse order.
     */
    public String reverseWords(String s) {
        // Split the input string into words by replacing multiple spaces with a single space and then using space as a delimiter.
        String[] words = s.replaceAll("\\s+", " ").split(" ");

        // Initialize the answer string.
        String answer = "";

        // Iterate through the words in reverse order and append them to the answer string.
        for (int i = words.length - 1; i >= 0; i--) {
            answer += words[i];
            answer += " ";
        }

        // Remove trailing spaces and return the reversed string.
        return answer.trim();
    }
}
