class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        // Count frequency of each character in magazine
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // Check if ransomNote can be built
        for (char c : ransomNote.toCharArray()) {
            if (charCounts[c - 'a'] == 0) {
                return false; // Character not available or count exhausted
            }
            charCounts[c - 'a']--;
        }

        return true;
    }
}
