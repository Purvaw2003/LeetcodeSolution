class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++) {
            boolean isPal = true;
            String word = words[i];
            for(int j = 0; j < word.length()/2; j++) {
                if(word.charAt(j) != word.charAt(word.length() - j - 1)) {
                    isPal = false;
                    break;
                }
            }
            if(isPal) {
                return word;
            }
        }
        
        return "";
    }
}
    
