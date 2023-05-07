class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0;
        int j = 0;
        StringBuilder ans = new StringBuilder();
        while (i < len1 || j < len2) {
            if (i < len1){
                ans.append(word1.charAt(i));
                i++;
            }
            if (j < len2){
                ans.append(word2.charAt(j));
                j++;
            }
        }
        return ans.toString();
    }
}

      
