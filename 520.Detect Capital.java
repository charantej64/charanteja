class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercaseCount = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                uppercaseCount++;
            }
        }

        if (uppercaseCount == n) {
            return true;
        }

        if (uppercaseCount == 0) {
            return true;
        }

        
        if (uppercaseCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}
