lass Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
           
            int index = word.charAt(word.length() - 1) - '1';
            
            
            String actualWord = word.substring(0, word.length() - 1);
            
            
            result[index] = actualWord;
        }

        return String.join(" ", result);
    }
}
